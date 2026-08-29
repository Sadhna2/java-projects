package day5;
import java.util.Scanner;

import Day3.Employee;

public class EmployeeArrays {
     public static void main (String []args) {
    	     Employee emp[]=new Employee[3];
    	     Scanner sc=new Scanner(System.in);
    	     for(int i=0;i<3;i++) {
    	    	     	System.out.println("enter eno. name salary");
    	    	     	emp[i]=new Employee(sc.nextInt(),sc.next(),sc.nextDouble());
    	     }
    	     for(Employee e:emp)
    	    	     System.out.println(e.getEmpno()+" "+e.getEmpname()+" "+e.getSalary());
     }
}
