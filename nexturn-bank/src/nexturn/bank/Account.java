package nexturn.bank;

public class Account {
	private long accountNumber;
    private int customerId;
    private double balance;
	public Account(long accountNumber, int customerId, double balance) {
		
		this.accountNumber = accountNumber;
		this.customerId = customerId;
		this.balance = balance;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
//	@Override
//	public String toString() {
//		return "Account [accountNumber=" + accountNumber + ", customerId=" + customerId + ", balance=" + balance + "]";
//	}
//    
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", customerId=" + customerId + ", balance=" + balance + "]";
	}
}
