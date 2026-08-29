package Day3;

public class SwapTwoString {

	public static void main(String[] args) {
		//8. to swap two strings

//s1="aaa" s2="bb";
		String s1 = "aaa";
		String s2 = "bb";

		System.out.println("Before swapping:");
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);

		String temp = s1;
		s1 = s2;
		s2 = temp;

		System.out.println("After swapping:");
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);

	}

}
