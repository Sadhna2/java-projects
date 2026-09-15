package com.nexturn.bankapp.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexturn.bankapp.entity.Account;
import com.nexturn.bankapp.entity.Customer;
import com.nexturn.bankapp.entity.Transaction;
import com.nexturn.bankapp.exceptions.AccountNotFoundException;
import com.nexturn.bankapp.exceptions.CustomerNotFoundException;
import com.nexturn.bankapp.exceptions.InsufficientBalanceException;
import com.nexturn.bankapp.repository.AccountRepository;
import com.nexturn.bankapp.repository.CustomerRepository;
import com.nexturn.bankapp.repository.TransactionRepository;

import jakarta.transaction.Transactional;

@Service
public class AccountOperationsImpl implements AccountOperations {

	@Autowired
	AccountRepository accountRepo;

	@Autowired
	CustomerRepository customerRepo;

	@Autowired
	TransactionRepository transactionRepo;

	private long accountNumber = 908300L;

	@Override
	public long createAccount(int customerId, double balance) {

		// Validation
		if (balance < 0) {
			throw new IllegalArgumentException("Balance cannot be negative");
		}

		Optional<Customer> customer = customerRepo.findById(customerId);

		if (customer.isEmpty()) {
			throw new CustomerNotFoundException(customerId);
		}

		Account account = new Account(customer.get(), balance);

		account.setAccountNumber(accountNumber++);

		Account savedAccount = accountRepo.save(account);

		return savedAccount.getAccountNumber();
	}

	@Override
	@Transactional
	public double deposit(long accountNumber, double amount) {

		// Validation
		if (amount <= 0) {
			throw new IllegalArgumentException("Amount must be greater than zero");
		}

		Optional<Account> account = accountRepo.findById(accountNumber);

		if (account.isEmpty()) {
			throw new AccountNotFoundException(accountNumber);
		}

		Account acc = account.get();

		double newBalance = acc.getBalance() + amount;

		acc.setBalance(newBalance);

		accountRepo.save(acc);

		Transaction transaction = new Transaction(LocalDateTime.now(), acc, "Deposit", amount, 0, newBalance);

		transactionRepo.save(transaction);

		return newBalance;
	}

	@Override
	@Transactional
	public double withdraw(long accountNumber, double amount) {

		// Validation
		if (amount <= 0) {
			throw new IllegalArgumentException("Amount must be greater than zero");
		}

		Optional<Account> account = accountRepo.findById(accountNumber);

		if (account.isEmpty()) {
			throw new AccountNotFoundException(accountNumber);
		}

		Account acc = account.get();

		if (acc.getBalance() < amount) {
			throw new InsufficientBalanceException();
		}

		double newBalance = acc.getBalance() - amount;

		acc.setBalance(newBalance);

		accountRepo.save(acc);

		Transaction transaction = new Transaction(LocalDateTime.now(), acc, "Withdraw", 0, amount, newBalance);

		transactionRepo.save(transaction);

		return newBalance;
	}

	@Override
	public double checkBalance(long accountNumber) {

		Optional<Account> account = accountRepo.findById(accountNumber);

		if (account.isEmpty()) {
			throw new AccountNotFoundException(accountNumber);
		}

		return account.get().getBalance();
	}

	@Override
	public List<Transaction> viewStatement(long accountNumber) {

		Optional<Account> account = accountRepo.findById(accountNumber);

		if (account.isEmpty()) {
			throw new AccountNotFoundException(accountNumber);
		}

		return transactionRepo.findByAccountOrderByTranDateDesc(account.get());
	}
}