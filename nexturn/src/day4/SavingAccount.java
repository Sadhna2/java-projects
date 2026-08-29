package day4;

import java.util.Scanner;

public class SavingAccount extends Account {

    private double interest_rate;

    public SavingAccount(String customerName, double openingBalance,
                         String account_type, double interest_rate) {
        super(customerName, openingBalance, account_type);
        this.interest_rate = interest_rate;
    }

    public void createAccount() {

        try {
            if (openingBalance < SAVING_BAL_THRESHOLD) {
                throw new LessOpeningBalanceException(AccountType.SAVING);
            }

            accountNo = 13242723980L;
            interest_rate = 7;

            System.out.println("Account created");
            System.out.println("Account number = " + accountNo);
            System.out.println("Customer name = " + customerName);
            System.out.println("Account type = " + account_type);
            System.out.println("Balance = " + openingBalance);
            System.out.println("Interest rate = " + interest_rate);

            deposit();

        }
        catch (LessOpeningBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
    public void deposit() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        long no = sc.nextLong();

        try {
            if (no != accountNo) {
                throw new AccountNotFormException();
            }

            System.out.print("Enter deposit amount: ");
            double amount = sc.nextDouble();

            openingBalance = openingBalance + amount;

            System.out.println("Deposit successful");
            System.out.println("Updated balance = " + openingBalance);

        }
        catch (AccountNotFormException e) {
            System.out.println(e.getMessage());
        }
    }
}