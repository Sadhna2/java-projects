package day6;

public class EmployeeNotFoundException extends RuntimeException{
	public EmployeeNotFoundException() {
		super("employee not found...");
		
	}
	public EmployeeNotFoundException(int empcode) {
		super("Employee with given code "+empcode +" not found");
	}

}
