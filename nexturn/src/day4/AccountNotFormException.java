package day4;

public class AccountNotFormException extends RuntimeException{
	public AccountNotFormException() {
		super("Account number is not matched");   
	}
}
