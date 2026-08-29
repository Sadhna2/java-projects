package day9;
import java.util.Scanner;


public class WeekEnumExample {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the week name");
		String name=sc.next();
	 
	     Week name1 = Week.valueOf(name);
	     String result=switch(name1) {
	     case MON-> "First day of week";
	     case TUE,WED,THR-> "Working days from office";
	     case FRI-> "Works for home";
	     case SAT,SUN->"Weekends";
	     default -> "Invalid month";
	     };
	     System.out.println(result);
	}
}
