package day9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Day3.Employee;
public class EmployeeList {
  public static void main(String []args) {
	  List<Employee> emplist=new ArrayList<Employee>();
	  emplist.add(new Employee(201,"nexturn",210938));
	  emplist.add(new Employee(121,"nicmar",70000));
		emplist.add(new Employee(103,"rohit",7000));
		emplist.add(new Employee(104,"muskan",10000000));
		emplist.add(new Employee(105,"semaran",4560000));
		
		Collections.sort(emplist,(e1,e2)->{
			return e1.getEmpname().compareTo(e2.getEmpname());
		});
		
		emplist.forEach((e)->
		System.out.println(e.getEmpno()+" "+e.getEmpname()+" "+e.getSalary()));
	  
  }
}
