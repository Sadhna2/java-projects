 package day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import Day3.Employee;

public class StreamExampleTwo {

	public static void main(String[] args) {
		List<Employee> emplist=new ArrayList<Employee>();
		emplist.add(new Employee(201,"nexturn",210938));
		emplist.add(new Employee(121,"nicmar",70000));
		emplist.add(new Employee(103,"rohit",7000));
		emplist.add(new Employee(104,"muskan",10000000));
		emplist.add(new Employee(105,"semaran",4560000));
		
		List<String> nameList=emplist.stream().map((emp)->emp.getEmpname())
				.collect(Collectors.toList());
		System.out.println(nameList);
		Optional<Employee>employee=emplist.stream().filter((emp)->emp.getEmpno()==105)
				                          
				                          .findFirst();
		// orElseThrow(()->new RunTimeException("employee not found"));
		if(employee.isEmpty()) System.out.println("emplyee not found");
		else System.out.println(employee);		

	}

}
