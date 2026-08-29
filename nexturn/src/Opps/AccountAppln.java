package Opps;

public class AccountAppln {

	public static void main(String[] args) {
		Account acnt=new Account(12345,6700000,"Sadhna");
		
		System.out.println("account Number: " +acnt.getAccountNumber()+", Amount:"+acnt.getAmount()+", Name:"+acnt.getCustomerName());
	
		
	}

}
