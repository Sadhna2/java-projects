package com.nexturn.bankapp.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Transaction {

	@Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "tran_id")
    private UUID tranId;

	@Column(name = "tran_date")
	private LocalDateTime tranDate;

	@ManyToOne
	@JoinColumn(name = "account_number")
	private Account account;

	@Column(name = "description")
	private String description;

	@Column(name = "deposit")
	private double deposit;

	@Column(name = "withdraw")
	private double withdraw;

	@Column(name = "balance")
	private double balance;

	public Transaction() {
	}

	public Transaction(LocalDateTime tranDate, Account account, String description, double deposit, double withdraw,
			double balance) {
		this.tranDate = tranDate;
		this.account = account;
		this.description = description;
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.balance = balance;
	}

	public UUID getTranId() {
		return tranId;
	}

	public void setTranId(UUID  tranId) {
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

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}