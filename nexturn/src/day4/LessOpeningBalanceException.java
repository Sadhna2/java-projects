package day4;
//
//public class LessOpeningBalanceException extends Exception {
//   public LessOpeningBalanceException(AccountType type) {
//	   super("Less opening balance amount... account cannot be created");
//	   if(type.equals(AccountType.SAVING))
//	   System.out.println("it should be 10000 for saving ");
//	   else if(type.equals(AccountType.CURRENT)) {
//		   System.out.println("it should be 25000 for current account");
//		   
//	   }
//   }
//}



public class LessOpeningBalanceException extends Exception {

    public LessOpeningBalanceException(AccountType type) {
        super(getMessage(type));
    }

    private static String getMessage(AccountType type) {

        if (type.equals(AccountType.SAVING)) {
            return "Less opening balance amount... it should be 10000 for saving";
        }
        else if (type.equals(AccountType.CURRENT)) {
            return "Less opening balance amount... it should be 25000 for current account";
        }

        return "Invalid account type";
    }
}
