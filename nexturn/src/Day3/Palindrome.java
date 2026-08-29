package Day3;

public class Palindrome {

    public static void main(String[] args) {

        String str = "madam";
        boolean result=str.equals(new StringBuilder(str).reverse().toString());
        System.out.println(result);
//        StringBuilder sb = new StringBuilder(str);
//        sb.reverse();
//        
//        if (str.equals(sb.toString())) {
//            System.out.println("Palindrome");
//        } else {
//            System.out.println("Not Palindrome");
//        }
    }
}