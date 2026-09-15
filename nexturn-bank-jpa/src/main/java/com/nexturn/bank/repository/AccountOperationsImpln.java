package com.nexturn.bank.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.nexturn.bank.PersistenceUtilities;
import com.nexturn.bank.entity.Account;
import com.nexturn.bank.entity.Customer;
import com.nexturn.bank.entity.Transaction;

public class AccountOperationsImpln implements AccountOperations {
	EntityManager manager;
	private int accountNumberCounter = 722747982;
	private int transactionIdCounter;

	@Override
	public long createAccount(Customer customer, double balance) {
		EntityManager manager = PersistenceUtilities.getEntityManager();
		EntityTransaction tran = manager.getTransaction();
		
		Account account = new Account();
		long accountNumber = accountNumberCounter++;
		account.setAccountNumber(accountNumber);
		account.setBalance(balance);

		customer.setAccount(account);
		account.setCustomer(customer);
		
		Transaction transaction = new Transaction();
		transaction.setTransId(transactionIdCounter++);
		transaction.setTranDate(LocalDateTime.now());
		transaction.setDescription("Account Opening");
		transaction.setDeposit(balance);
		transaction.setWithdraw(0);
		transaction.setBalance(balance);
		transaction.setAccount(account);

		List<Transaction> transactions = new ArrayList<>();
		transactions.add(transaction);
		account.setTransactions(transactions);
		tran.begin();

		manager.persist(customer);
		tran.commit();
		System.out.println("Account created successfully!");
		System.out.println("Account Number: " + accountNumber);
		manager.close();
		return accountNumber;

	}

	@Override
	public double deposit(long accountNumber, double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double withdraw(long accountNumber, double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double checkBalance(long accountNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Transaction> viewStatement(long accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
