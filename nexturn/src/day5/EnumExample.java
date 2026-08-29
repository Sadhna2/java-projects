package day5;
import java.util.Scanner;
public class EnumExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month name ");
		String name=sc.next();
	 
	 Month name1 = Month.valueOf(name);
	 
	 
	 switch (name1) {
	 case JAN,MAR,MAY,JULY,AUG,OCT,DEC:
		 System.out.println("31 "); break;
	 case FEB:
		 System.out.println("28 "); break;
	 case APR,JUNE,SEP,NOV:
		 System.out.println("30 "); break;
		 
   default: 
			throw new InvalidMonthException(); 
		 
	 }
	 

	}

}
