package day14;

public class Palindrome {
	public boolean isPalindrome(String str) {
    	boolean result=str.equals(new StringBuilder(str).reverse().toString());
		return result;
    }
}
