package com.nexturn.bankapp.services;

import java.util.List;

import com.nexturn.bankapp.entity.Transaction;
import com.nexturn.bankapp.exceptions.AccountNotFoundException;
import com.nexturn.bankapp.exceptions.CustomerNotFoundException;
import com.nexturn.bankapp.exceptions.InsufficientBalanceException;

public interface AccountOperations {

	long createAccount(int customerId, double balance) throws CustomerNotFoundException;

	double deposit(long accountNumber, double amount) throws AccountNotFoundException;

	double withdraw(long accountNumber, double amount) throws AccountNotFoundException, InsufficientBalanceException;

	double checkBalance(long accountNumber) throws AccountNotFoundException;

	List<Transaction> viewStatement(long accountNumber) throws AccountNotFoundException;
}