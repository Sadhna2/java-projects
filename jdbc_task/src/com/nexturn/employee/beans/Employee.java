package com.nexturn.employee.beans;

import java.time.LocalDate;

public class Employee {
    

	private int empcode;
    private String empname;
    private double salary;
    private LocalDate doj;
    
    public Employee () {
    	
    }

	public Employee(int empcode, String empname, double salary, LocalDate doj) {
		this.empcode = empcode;
		this.empname = empname;
		this.salary = salary;
		this.doj = doj;
	}

	public int getEmpcode() {
		return empcode;
	}

	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Employee [empcode=" + empcode + ", empname=" + empname + ", salary=" + salary + ", doj=" + doj + "]";
	}
    
}
