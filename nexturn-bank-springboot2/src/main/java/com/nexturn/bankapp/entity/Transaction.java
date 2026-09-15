package com.nexturn.bankapp.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import com.nexturn.bankapp.enums.TransactionType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "transactions")
public class Transaction {

	@Id
	@Column(name = "tran_id")
	private String tranId;

	@Column(name = "tran_date")
	private LocalDateTime tranDate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "account_number")
	private Account account;

	private String description;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private TransactionType type;

	@Column(nullable = false)
	private double amount;

	private double balance;

	public Transaction() {
	}

	@PrePersist
	private void generateTransactionDetails() {

		if (tranId == null) {
			tranId = UUID.randomUUID().toString();
		}

		if (tranDate == null) {
			tranDate = LocalDateTime.now();
		}
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

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
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