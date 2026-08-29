package nexturn.bank;

import java.util.List;

public interface AccountOperations {
	
    long createAccount(String customerName,double balance);
    double deposit(long accountNumber, double amount);
    double withdraw(long accountNumber, double amount);
    double checkBalance(long accountNumber);
    List<Transaction> viewStatement(long accountNumber);
}
