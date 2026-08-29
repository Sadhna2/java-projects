package day4;

public class CurrentAccount extends Account {
	private int OverDraft;

	public CurrentAccount(long accountNo, String customerName, int openingBalance, String account_type,int OverDraft) {
		super( customerName, openingBalance, account_type);
		
			this.OverDraft=OverDraft;
	}
	public void createAccount() {
		try {
		    if(openingBalance<OverDraft)   
		    	    throw new LessOpeningBalanceException(AccountType.CURRENT);
		    System.out.println("this is from CurrentAccount class account is created");
		    System.out.println("Account number="+accountNo);
		    System.out.println("Customer name="+customerName);
		    System.out.println("Account type="+account_type);
		    System.out.println("Balance="+openingBalance);
		    System.out.println("OverDraft="+OverDraft);
		
	       
		    
		}
		catch (LessOpeningBalanceException e) {
            System.out.println(e.getMessage());
        }
	}  
	   
}
