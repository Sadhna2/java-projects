package com.nexturn.bankapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.nexturn.bankapp.entity.Transaction;
import com.nexturn.bankapp.services.AccountOperations;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	AccountOperations service;

	@PostMapping("/create")
	public ResponseEntity<Long> createAccount(@RequestParam int customerId, @RequestParam double balance) {

		long accountNumber = service.createAccount(customerId, balance);

		return new ResponseEntity<>(accountNumber, HttpStatus.CREATED);
	}

	@PostMapping("/deposit/{accountNumber}")
	public ResponseEntity<Double> deposit(@PathVariable long accountNumber, @RequestParam double amount) {

		double balance = service.deposit(accountNumber, amount);

		return new ResponseEntity<>(balance, HttpStatus.OK);
	}

	@PostMapping("/withdraw/{accountNumber}")
	public ResponseEntity<Double> withdraw(@PathVariable long accountNumber, @RequestParam double amount) {

		double balance = service.withdraw(accountNumber, amount);

		return new ResponseEntity<>(balance, HttpStatus.OK);
	}

	@GetMapping("/balance/{accountNumber}")
	public ResponseEntity<Double> checkBalance(@PathVariable long accountNumber) {

		double balance = service.checkBalance(accountNumber);

		return new ResponseEntity<>(balance, HttpStatus.OK);
	}

	@GetMapping("/statement/{accountNumber}")
	public ResponseEntity<List<Transaction>> viewStatement(@PathVariable long accountNumber) {

		List<Transaction> transactions = service.viewStatement(accountNumber);

		return new ResponseEntity<>(transactions, HttpStatus.OK);
	}
}