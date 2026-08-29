package com.nexturn.employee;

import java.time.LocalDate;

import com.nexturn.employee.beans.Employee;
import com.nexturn.employee.dao.EmployeeDao;
import com.nexturn.employee.dao.EmployeeDaoImpl;

public class UpdateEmployee {
    public static void main(String[] args) {
        EmployeeDao dao = new EmployeeDaoImpl();
        Employee emp = new Employee(
                105,
                "James Gosling Updated",
                120000,
                LocalDate.now()
        );
        int result = dao.updateEmployee(emp);

        if (result == 1) {
            System.out.println("Employee updated successfully");
        } else {
            System.out.println("Employee not found");
        }
    }
}