package nexturn.bank; 

import java.util.List; 
import java.util.Scanner; 

public class BankApplication { 
	public static void main(String[] args) { 
		Scanner scanner =new Scanner(System.in); 
		AccountOperationsImpl operations=new AccountOperationsImpl(); 
		char choice; 
		do { 
			  System.out.println(); 
			  System.out.println("c - Create Account"); 
	            System.out.println("d - Deposit"); 
	            System.out.println("w - Withdraw"); 
	            System.out.println("b - Balance Check"); 
	            System.out.println("s - View Statement"); 
	            System.out.println("x - Exit"); 
	            System.out.println("Enter your choice:"); 
	            choice =scanner.next().charAt(0); 
	            switch (choice) { 
	            	case 'c'->{ 
	            		System.out.println("enter the customer name"); 
	            		String customerName =scanner.next(); 
	            		 System.out.print("Enter opening balance: "); 
	            		 double balance=scanner.nextDouble(); 
	            		 if(balance<0) { 
	            			 System.out.println( "Opening balance cannot be negative."); 
	            		 } 
	            		 else { 
	            			 long accountNumber = 
                                    operations.createAccount( 
                                            customerName, 
                                            balance 
                                    ); 
	            			 System.out.println("Account created successfully."); 
	            			 System.out.println("Account Number:"+accountNumber); 
	            		 } 
	            	} 
	            	case 'd'->{ 
	              		System.out.println("enter account number"); 
                        long depositAccount =scanner.nextLong(); 
                        System.out.print( "Enter deposit amount: "); 
                        double depositAmount =scanner.nextDouble(); 
                        double depositBalance = 
                                operations.deposit( 
                                        depositAccount, 
                                        depositAmount 
                                ); 
                        System.out.println("Deposit successful."); 
                        System.out.println("Current Balance: "+ depositBalance); 
	            	} 
	            	case 'w' -> { 
                        System.out.print("Enter account number: "); 
                        long withdrawAccount = scanner.nextLong(); 
                        System.out.print("Enter withdrawal amount: "); 
                        double withdrawAmount = scanner.nextDouble(); 
                        double withdrawBalance = operations.withdraw(withdrawAccount, withdrawAmount); 
                        System.out.println("Withdrawal successful."); 
                        System.out.println("Current Balance: " + withdrawBalance); 
                    } 
                    case 'b' -> { 
                        System.out.print("Enter account number: "); 
                        long balanceAccount = scanner.nextLong(); 
                        double currentBalance = operations.checkBalance(balanceAccount); 
                        System.out.println("Current Balance: " + currentBalance); 
                    } 
                    case 's' -> { 
                        System.out.print("Enter account number: "); 
                        long statementAccount = scanner.nextLong(); 
                        List<Transaction> transactions = operations.viewStatement(statementAccount); 
                        System.out.println(); 
                        if (transactions.isEmpty()) { 
                            System.out.println("No transactions found."); 
                        } 
                        else { 
                            System.out.println("ID | Date | Account | Description | Deposit | Withdraw | Balance"); 
                            transactions.forEach(System.out::println); 
                        } 
                    } 
                    case 'x' -> System.out.println("Thank you for using Nexturn Bank."); 
                    default -> System.out.println("Invalid choice. Please try again."); 
                } 

        } while(choice != 'x'); 
	} 

}