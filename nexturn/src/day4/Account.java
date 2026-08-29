package day4;

public abstract class Account {
   static final double SAVING_BAL_THRESHOLD=100000;
   static final double OverDraft=250000;
   protected long accountNo;
   protected String customerName;
   protected double openingBalance;
   protected String account_type;
   public Account( String customerName, double openingBalance, String account_type) {
	

	this.customerName = customerName;
	this.openingBalance = openingBalance;
	this.account_type = account_type;
   }
   
   public abstract void createAccount() ;
   
   
   
}
