package nexturn.bank;

import java.time.LocalDateTime;

public class Transaction {
   private int transId;
   private LocalDateTime tranDate;
   private long accountNumber;
   private String description;
   private double deposit;
   private double withdraw;
   private double balance;
   public Transaction(int transId, LocalDateTime tranDate, long accountNumber, String description, double deposit,
		double withdraw, double balance) {
	
	this.transId = transId;
	this.tranDate = tranDate;
	this.accountNumber = accountNumber;
	this.description = description;
	this.deposit = deposit;
	this.withdraw = withdraw;
	this.balance = balance;
   }

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
   @Override
public String toString() {
	return "Transaction [transId=" + transId + ", tranDate=" + tranDate + ", accountNumber=" + accountNumber
			+ ", description=" + description + ", deposit=" + deposit + ", withdraw=" + withdraw + ", balance="
			+ balance + "]";
}
}
