package com.nexturn.bankapp.services;

import java.util.List;

import com.nexturn.bankapp.dto.AccountResponseDTO;
import com.nexturn.bankapp.dto.BalanceResponseDTO;
import com.nexturn.bankapp.dto.CreateAccountRequest;
import com.nexturn.bankapp.dto.TransactionRequestDTO;
import com.nexturn.bankapp.dto.TransactionResponseDTO;

public interface AccountOperations {

	AccountResponseDTO createAccount(CreateAccountRequest request);

	BalanceResponseDTO deposit(TransactionRequestDTO request);

	BalanceResponseDTO withdraw(TransactionRequestDTO request);

	BalanceResponseDTO checkBalance(long accountNumber);

	List<TransactionResponseDTO> viewStatement(long accountNumber);
}