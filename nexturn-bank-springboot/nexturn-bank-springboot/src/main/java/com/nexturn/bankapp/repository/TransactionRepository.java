package com.nexturn.bankapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexturn.bankapp.entity.Account;
import com.nexturn.bankapp.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

	List<Transaction> findByAccountOrderByTranDateDesc(Account account);
}