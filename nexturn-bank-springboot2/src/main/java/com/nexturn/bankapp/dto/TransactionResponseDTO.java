package com.nexturn.bankapp.dto;

import java.time.LocalDateTime;

import com.nexturn.bankapp.enums.TransactionType;

public class TransactionResponseDTO {

    private String tranId;

    private LocalDateTime tranDate;

    private long accountNumber;

    private String description;

    private TransactionType type;

    private double amount;

    private double balance;

    public TransactionResponseDTO() {

    }

    public TransactionResponseDTO(String tranId,
                                  LocalDateTime tranDate,
                                  long accountNumber,
                                  String description,
                                  TransactionType type,
                                  double amount,
                                  double balance) {

        this.tranId = tranId;
        this.tranDate = tranDate;
        this.accountNumber = accountNumber;
        this.description = description;
        this.type = type;
        this.amount = amount;
        this.balance = balance;
    }

    public String getTranId() {
        return tranId;
    }

    public void setTranId(String tranId) {
        this.tranId = tranId;
    }

    public LocalDateTime getTranDate() {
        return tranDate;
    }

    public void setTranDate(LocalDateTime tranDate) {
        this.tranDate = tranDate;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}