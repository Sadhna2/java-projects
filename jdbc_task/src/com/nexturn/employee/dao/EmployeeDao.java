package com.nexturn.employee.dao;

import java.util.List;
import java.util.Optional;

import com.nexturn.employee.beans.Employee;

public interface EmployeeDao {
    int addEmployee(Employee employee);
    int updateEmployee(Employee employee);
    int deleteEmployee(int empcode);
    List<Employee> getAllEmployees();
    Optional<Employee> getEmployeeByCode(int empcode);
    
}
