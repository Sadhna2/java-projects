package day4;

public class BankApplication {
	

	public static void main(String[] args) {
//		String name="nexturn";
//		double amount=8000;
		
		// TODO Auto-generated method stub
	//	String type="saving";
		AccountType type=AccountType.SAVING;
		if(type.equals(AccountType.SAVING)) {			
			SavingAccount sv=new SavingAccount("babita",100007,"savingAccount",5.1);
			sv.createAccount();
		}
		else if(type.equals(AccountType.CURRENT)) {
			CurrentAccount curr=new CurrentAccount(1223,"babita",250007,"CurrentAccount",500000000);
			curr.createAccount();
		}		
      
      
	}

}
