package com.nexturn.employee;

import com.nexturn.employee.dao.EmployeeDao;
import com.nexturn.employee.dao.EmployeeDaoImpl;

public class DeleteEmployee {
    public static void main(String[] args) {
        EmployeeDao dao = new EmployeeDaoImpl();
        int empcode = 106;
        int result = dao.deleteEmployee(empcode);
        if (result == 1) {
            System.out.println("Employee deleted successfully");
        } else {
            System.out.println("Employee not found");
        }
    }
}