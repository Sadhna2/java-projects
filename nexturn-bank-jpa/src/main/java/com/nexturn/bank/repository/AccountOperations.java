package com.nexturn.bank.repository;

import java.util.List;

import com.nexturn.bank.entity.Customer;
import com.nexturn.bank.entity.Transaction;

public interface AccountOperations {
    long createAccount(Customer customer, double balance);
    double deposit(long accountNumber, double amount);
    double withdraw(long accountNumber, double amount);
    double checkBalance(long accountNumber);
    List<Transaction> viewStatement(long accountNumber);

}