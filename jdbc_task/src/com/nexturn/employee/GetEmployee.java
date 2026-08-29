package com.nexturn.employee;

import java.util.List;
import java.util.Optional;

import com.nexturn.employee.beans.Employee;
import com.nexturn.employee.dao.EmployeeDao;
import com.nexturn.employee.dao.EmployeeDaoImpl;

public class GetEmployee {

	public static void main(String[] args) {
		EmployeeDao dao= new EmployeeDaoImpl();
		List <Employee> emplist =dao.getAllEmployees();
		if(emplist.isEmpty())
			System.out.println("no records found");
		else 
			emplist.forEach((e)->System.out.println(e.getEmpcode()+" "+e.getEmpname()+" "+
		e.getSalary()+" "+e.getDoj()));
		
		// to get single employee
		Optional<Employee> optionalEmp = dao.getEmployeeByCode(104);

		if (optionalEmp.isPresent()) {

		    Employee emp = optionalEmp.get();
		    System.out.println(emp.getEmpcode()+" "+emp.getEmpname()+" "+
		    		emp.getSalary()+" "+emp.getDoj());
		} else {

		    System.out.println("Employee not found");
		}    
		//Employee emp=dao.getEmployeeByCode(103);
		//if(emp==null)
//			System.out.println("not found");
//		else 
//			System.out.println(emp);

	}

}
