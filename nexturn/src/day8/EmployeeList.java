package day8;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Day3.Employee;
public class EmployeeList {
	public void getdetails(List<Employee> emplist, int empno) {
	    boolean found = false;
	    for (Employee emp : emplist) {
	        if (emp.getEmpno() == empno) {
	            System.out.println(emp.getEmpno() + " " +emp.getEmpname() + " " +emp.getSalary()
	            );
	            found = true;
	            break;
	        }
	    }
	    if (!found) {
	        System.out.println("Employee not found");
	    }
	}
	public static void main(String[] args) {
		List<Employee>emplist=new ArrayList<Employee>();
		emplist.add(new Employee(101,"nexturn",60000));
		emplist.add(new Employee(121,"nicmar",70000));
		emplist.add(new Employee(103,"rohit",7000));
		emplist.add(new Employee(104,"muskan",10000000));
		emplist.add(new Employee(105,"semaran",4560000));
		for(Employee emp:emplist) {
			System.out.println(emp.getEmpno()+" "+emp.getEmpname()+" "+emp.getSalary());
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter empno to get the detail");
		int empno=sc.nextInt();
		EmployeeList e=new EmployeeList();
		e.getdetails(emplist,empno);

	}

}
