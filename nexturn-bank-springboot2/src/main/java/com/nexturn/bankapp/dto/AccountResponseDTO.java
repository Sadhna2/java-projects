package com.nexturn.bankapp.dto;

public class AccountResponseDTO {

    private long accountNumber;
    private String customerId;
    private double balance;
    private String message;

    public AccountResponseDTO() {
    }

    public AccountResponseDTO(long accountNumber,
                              String customerId,
                              double balance,
                              String message) {

        this.accountNumber = accountNumber;
        this.customerId = customerId;
        this.balance = balance;
        this.message = message;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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