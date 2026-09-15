package com.nexturn.bankapp.dto;

public class TransactionRequestDTO {

	private long accountNumber;
	private double amount;

	public TransactionRequestDTO() {
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}