package com.nexturn.bank.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Transaction {
	@Id	
	private int transId;
	@Column
	private LocalDateTime tranDate;
	
	@Column(length = 50)
	private String description;
	@Column
	private double deposit;
	@Column
	private double withdraw;
	@Column
	private double balance;
	@ManyToOne
	@JoinColumn(name="accountNumber")
	private Account account;
	public int getTransId() {
		return transId;
	}
	public void setTransId(int transId) {
		this.transId = transId;
	}
	public LocalDateTime getTranDate() {
		return tranDate;
	}
	public void setTranDate(LocalDateTime tranDate) {
		this.tranDate = tranDate;
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
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Transaction() {
		super();
	}
}
