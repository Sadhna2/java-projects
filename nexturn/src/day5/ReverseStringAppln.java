package day5;

public class ReverseStringAppln {

	public static void main(String[] args) {
		
		Reverse r=(s)->{		

	        StringBuilder sb = new StringBuilder(s);
	        sb.reverse();
	       // return sb.toString().toUpperCase();
	       String str=   sb.toString();
	       return str.toUpperCase(); // string is immutable so we have to store it.
	         
			
			
		};
		System.out.println(r.reverseAndUpperCase("hello"));
		

	}

}
