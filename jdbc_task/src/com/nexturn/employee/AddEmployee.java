package com.nexturn.employee;

import java.time.LocalDate;

import com.nexturn.employee.beans.Employee;
import com.nexturn.employee.dao.EmployeeDao;
import com.nexturn.employee.dao.EmployeeDaoImpl;

public class AddEmployee {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmpcode(105);
		emp.setEmpname("Aditya");
		emp.setSalary(928979);
		emp.setDoj(LocalDate.parse("2026-08-10"));
		EmployeeDao dao=new EmployeeDaoImpl();
		int rows=dao.addEmployee(emp);
		if(rows>0) 
			System.out.println("inserted");
		else 
			System.out.println("not inserted");

	}

}
