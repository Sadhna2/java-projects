package sample;

public class Customer {
	private String name;
	private int code;
	private Account account;
	
	public Customer(Account account) {
		
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Account getAccount() {
		return account;
	}
	
	

}
