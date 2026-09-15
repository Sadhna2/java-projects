package sample;

public class Account {
	private int accountNo;
	private double balance;

	public Account() {
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account(int accountNo, double balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}
}
