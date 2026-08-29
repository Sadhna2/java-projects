package day6;
import java.util.Scanner;
public class CustomException {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter employee code");
		int empcode=sc.nextInt();
		try {
			if(empcode!=101)
				throw new EmployeeNotFoundException(empcode);
			System.out.println("Welcome ... your Salary =500000000");
		}
		catch(EmployeeNotFoundException e) {
			// e.printStackTree();
			System.out.println(e.getMessage());
		}
		System.out.println("success");

	}

}
