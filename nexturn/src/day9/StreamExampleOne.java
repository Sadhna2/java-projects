package day9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Day3.Employee;

public class StreamExampleOne {

	public static void main(String[] args) {
		List<Employee> emplist=new ArrayList<Employee>();
		  emplist.add(new Employee(201,"nexturn",210938));
		  emplist.add(new Employee(121,"nicmar",70000));
			emplist.add(new Employee(103,"rohit",7000));
			emplist.add(new Employee(104,"muskan",10000000));
			emplist.add(new Employee(105,"semaran",4560000));
			
		List<Employee> salAbove20k=emplist.stream()
				.filter((emp)->emp.getSalary()>=20000)
				.collect(Collectors.toList());
		salAbove20k.forEach((emp)->System.out.println(emp.getEmpno()+" "+emp.getEmpname()+" "+emp.getSalary()));
	}

}
