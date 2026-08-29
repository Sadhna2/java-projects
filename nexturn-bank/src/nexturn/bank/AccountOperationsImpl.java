package nexturn.bank; 
 
import java.time.LocalDateTime; 
import java.util.ArrayList; 
import java.util.HashMap; 
import java.util.List; 
 
public class AccountOperationsImpl implements AccountOperations{ 
	private List<Account> accountList = new ArrayList<>(); 
	private HashMap<Long,List<Transaction>> transactionMap=new HashMap<>(); 
	private long accountNumberCounter=10234567889L; 
	private int transactionIdCounter=1; 
	private int customerIdCounter=1; 
	 
	 
	@Override 
	public long createAccount(String customerName, double balance) { 
		// TODO Auto-generated method stub 
		Long accountNumber=accountNumberCounter++; 
		int newCustomerId=customerIdCounter++; 
		 Account account = new Account(accountNumber,newCustomerId,balance); 
		 accountList.add(account); 
	     List<Transaction> transactionList = new ArrayList<>(); 
	     transactionMap.put(accountNumber, transactionList)	;      
 
		return accountNumber; 
	} 
 
	@Override 
	public double deposit(long accountNumber, double amount) { 
		// TODO Auto-generated method stub 
		try { 
			Account account=findAccount(accountNumber); 
			double newBalance=account.getBalance()+amount; 
			account.setBalance(newBalance); 
			Transaction transaction =new Transaction(transactionIdCounter++,LocalDateTime.now(),accountNumber,"Deposit",amount,0,newBalance); 
			transactionMap.get(accountNumber).add(transaction); 
			return newBalance; 
		} catch(AccountNotFoundException e) { 
			System.out.println("ERROR: "+e.getMessage()); 
			throw e; 
		} 
	} 
 
	 
 
	@Override 
	public double withdraw(long accountNumber, double amount) { 
		// TODO Auto-generated method stub 
		try { 
			Account account=findAccount(accountNumber); 
			if(amount>account.getBalance()) { 
				throw new InsufficientBalanceException("Insufficient balance ...Availale balance:"+account.getBalance()); 
			} 
			double newBalance=account.getBalance()-amount; 
			account.setBalance(newBalance); 
			Transaction transaction =new Transaction(transactionIdCounter++,LocalDateTime.now(),accountNumber,"Withdraw",0,amount,newBalance); 
			 transactionMap.get(accountNumber).add(transaction); 
 
	        return newBalance; 
		} catch(AccountNotFoundException e) { 
			System.out.println("ERROR: "+e.getMessage()); 
			throw e; 
		} catch(InsufficientBalanceException e) { 
			System.out.println("ERROR: "+e.getMessage()); 
			throw e; 
		} 
	} 
 
	@Override 
	public double checkBalance(long accountNumber) { 
		// TODO Auto-generated method stub 
		try { 
			Account account =findAccount(accountNumber); 
			 
			return account.getBalance(); 
		} catch(AccountNotFoundException e) { 
			System.out.println("ERROR: "+e.getMessage()); 
			throw e; 
		} 
	} 
 
	@Override 
	public List<Transaction> viewStatement(long accountNumber) { 
		// TODO Auto-generated method stub 
		try { 
			findAccount(accountNumber); 
			return transactionMap.get(accountNumber); 
		} catch(AccountNotFoundException e) { 
			System.out.println("ERROR: "+e.getMessage()); 
			throw e; 
		} 
	} 
	private Account findAccount(long accountNumber) { 
		// TODO Auto-generated method stub 
		 
		return accountList.stream() 
				.filter(account->account.getAccountNumber()==accountNumber) 
				.findFirst() 
				.orElseThrow(()-> new AccountNotFoundException("account not found: " +accountNumber)); 
	} 
 
} 