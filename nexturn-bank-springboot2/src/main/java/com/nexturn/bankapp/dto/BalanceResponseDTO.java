package com.nexturn.bankapp.dto;

public class BalanceResponseDTO {

    private long accountNumber;
    private double balance;
    private String message;

    public BalanceResponseDTO() {
    }

    public BalanceResponseDTO(long accountNumber,
                              double balance,
                              String message) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.message = message;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}