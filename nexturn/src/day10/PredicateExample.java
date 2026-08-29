package day10;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import Day3.Employee;

public class PredicateExample {

	public static void main(String[] args) {
		List<Employee> emplist=new ArrayList<Employee>();
		emplist.add(new Employee(201,"nexturn",210938));
		emplist.add(new Employee(121,"nicmar",70000));
		emplist.add(new Employee(103,"rohit",21000));
		emplist.add(new Employee(104,"muskan",10000000));
		emplist.add(new Employee(105,"semaran",4560000));
		Predicate<Employee> testsal=(emp1)->emp1.getSalary()>20000;
		Predicate<Employee> testsal2=(emp1)->(emp1.getSalary()>=20000 && emp1.getSalary()<=40000);
		
		Predicate<String> pred=t->t.length()>5;
		String str="Successfully";
		System.out.println(pred.test(str));
		
		for(Employee emp:emplist)
			if(testsal.test(emp))
				System.out.println(emp);
		System.out.println("next"); 
		for(Employee emp:emplist)
			if(testsal2.test(emp))
				System.out.println(emp);
		System.out.println("next"); 
		List <Employee> predList =emplist.stream()
				.filter(testsal)
				.collect(Collectors.toList());
		System.out.println(predList);

	}

}
