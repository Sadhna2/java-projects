package com.nexturn.bankapp.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nexturn.bankapp.dto.AccountResponseDTO;
import com.nexturn.bankapp.dto.BalanceResponseDTO;
import com.nexturn.bankapp.dto.CreateAccountRequest;
import com.nexturn.bankapp.dto.TransactionRequestDTO;
import com.nexturn.bankapp.dto.TransactionResponseDTO;
import com.nexturn.bankapp.entity.Account;
import com.nexturn.bankapp.entity.Customer;
import com.nexturn.bankapp.entity.Transaction;
import com.nexturn.bankapp.enums.TransactionType;
import com.nexturn.bankapp.exceptions.AccountNotFoundException;
import com.nexturn.bankapp.exceptions.InsufficientBalanceException;
import com.nexturn.bankapp.repository.AccountRepository;
import com.nexturn.bankapp.repository.TransactionRepository;

@Service
@Transactional
public class AccountOperationsImpl implements AccountOperations {

    private final AccountRepository accountRepository;
    private final TransactionRepository transactionRepository;

    public AccountOperationsImpl(
            AccountRepository accountRepository,
            TransactionRepository transactionRepository) {

        this.accountRepository = accountRepository;
        this.transactionRepository = transactionRepository;
    }

    @Override
    public AccountResponseDTO createAccount(
            CreateAccountRequest request) {

        if (request.getBalance() < 0) {
            throw new IllegalArgumentException(
                    "Initial balance cannot be negative");
        }

        Customer customer = new Customer();

        customer.setName(request.getName());
        customer.setEmail(request.getEmail());
        customer.setPhone(request.getPhone());
        customer.setAddress(request.getAddress());

        Account account = new Account();

        account.setCustomer(customer);
        account.setBalance(request.getBalance());

        Account savedAccount =
                accountRepository.save(account);

        // Create initial deposit transaction
        Transaction transaction = new Transaction();

        transaction.setAccount(savedAccount);
        transaction.setDescription("Initial Deposit");
        transaction.setType(TransactionType.DEPOSIT);
        transaction.setAmount(request.getBalance());
        transaction.setBalance(savedAccount.getBalance());

        transactionRepository.save(transaction);

        return new AccountResponseDTO(
                savedAccount.getAccountNumber(),
                savedAccount.getCustomer().getCustomerId(),
                savedAccount.getBalance(),
                "Account created successfully");
    }

    @Override
    public BalanceResponseDTO deposit(
            TransactionRequestDTO request) {

        if (request.getAmount() <= 0) {
            throw new IllegalArgumentException(
                    "Deposit amount must be greater than zero");
        }

        Account account =
                findAccount(request.getAccountNumber());

        account.setBalance(
                account.getBalance()
                        + request.getAmount());

        Transaction transaction = new Transaction();

        transaction.setAccount(account);
        transaction.setDescription("Amount Deposited");
        transaction.setType(TransactionType.DEPOSIT);
        transaction.setAmount(request.getAmount());
        transaction.setBalance(account.getBalance());

        transactionRepository.save(transaction);

        return new BalanceResponseDTO(
                account.getAccountNumber(),
                account.getBalance(),
                "Amount deposited successfully");
    }

    @Override
    public BalanceResponseDTO withdraw(
            TransactionRequestDTO request) {

        if (request.getAmount() <= 0) {
            throw new IllegalArgumentException(
                    "Withdraw amount must be greater than zero");
        }

        Account account =
                findAccount(request.getAccountNumber());

        if (account.getBalance() < request.getAmount()) {
            throw new InsufficientBalanceException(
                    "Insufficient balance");
        }

        account.setBalance(
                account.getBalance()
                        - request.getAmount());

        Transaction transaction = new Transaction();

        transaction.setAccount(account);
        transaction.setDescription("Amount Withdrawn");
        transaction.setType(TransactionType.WITHDRAW);
        transaction.setAmount(request.getAmount());
        transaction.setBalance(account.getBalance());

        transactionRepository.save(transaction);

        return new BalanceResponseDTO(
                account.getAccountNumber(),
                account.getBalance(),
                "Amount withdrawn successfully");
    }

    @Override
    public BalanceResponseDTO checkBalance(
            long accountNumber) {

        Account account =
                findAccount(accountNumber);

        return new BalanceResponseDTO(
                account.getAccountNumber(),
                account.getBalance(),
                "Balance fetched successfully");
    }

    @Override
    public List<TransactionResponseDTO> viewStatement(
            long accountNumber) {

        findAccount(accountNumber);

        List<Transaction> transactions =
                transactionRepository
                        .findByAccountAccountNumber(accountNumber);

        return transactions.stream()
                .map(this::convertToDTO)
                .toList();
    }

    private Account findAccount(long accountNumber) {

        return accountRepository
                .findById(accountNumber)
                .orElseThrow(() ->
                        new AccountNotFoundException(
                                "Account not found: "
                                        + accountNumber));
    }

    private TransactionResponseDTO convertToDTO(
            Transaction transaction) {

        return new TransactionResponseDTO(
                transaction.getTranId(),
                transaction.getTranDate(),
                transaction.getAccount()
                        .getAccountNumber(),
                transaction.getDescription(),
                transaction.getType(),
                transaction.getAmount(),
                transaction.getBalance());
    }
}