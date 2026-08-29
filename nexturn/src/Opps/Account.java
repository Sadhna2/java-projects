package Opps;

public class Account {

	private int accountNumber;
	private double amount;
	private String customerName;
	
    public Account(int accountNumber, double amount, String customerName) {
		
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.customerName = customerName;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	

}
