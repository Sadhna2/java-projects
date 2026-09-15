package com.nexturn.bankapp.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nexturn.bankapp.dto.AccountResponseDTO;
import com.nexturn.bankapp.dto.BalanceResponseDTO;
import com.nexturn.bankapp.dto.CreateAccountRequest;
import com.nexturn.bankapp.dto.TransactionRequestDTO;
import com.nexturn.bankapp.dto.TransactionResponseDTO;
import com.nexturn.bankapp.services.AccountOperations;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountOperations accountOperations;

    public AccountController(AccountOperations accountOperations) {
        this.accountOperations = accountOperations;
    }

    @PostMapping
    public ResponseEntity<AccountResponseDTO> createAccount(
            @RequestBody CreateAccountRequest request) {

        AccountResponseDTO response =
                accountOperations.createAccount(request);

        return new ResponseEntity<>(
                response,
                HttpStatus.CREATED);
    }

    @PostMapping("/deposit")
    public ResponseEntity<BalanceResponseDTO> deposit(
            @RequestBody TransactionRequestDTO request) {

        BalanceResponseDTO response =
                accountOperations.deposit(request);

        return ResponseEntity.ok(response);
    }

    @PostMapping("/withdraw")
    public ResponseEntity<BalanceResponseDTO> withdraw(
            @RequestBody TransactionRequestDTO request) {

        BalanceResponseDTO response =
                accountOperations.withdraw(request);

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{accountNumber}/balance")
    public ResponseEntity<BalanceResponseDTO> checkBalance(
            @PathVariable long accountNumber) {

        BalanceResponseDTO response =
                accountOperations.checkBalance(accountNumber);

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{accountNumber}/statement")
    public ResponseEntity<List<TransactionResponseDTO>> viewStatement(
            @PathVariable long accountNumber) {

        List<TransactionResponseDTO> response =
                accountOperations.viewStatement(accountNumber);

        return ResponseEntity.ok(response);
    }
}