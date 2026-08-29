package com.nexturn.employee.test;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.nexturn.employee.beans.Employee;
import com.nexturn.employee.dao.EmployeeDao;
import com.nexturn.employee.dao.EmployeeDaoImpl;
@TestInstance(Lifecycle.PER_CLASS)
class EmployeeDaoTest {
    EmployeeDao dao;
    
    @BeforeAll
    void init() {
    	   dao=new EmployeeDaoImpl();
    }
    @Disabled
	@Test
	void testAddEmployee() {
		Employee emp=new Employee(106,"james gosling",109038,LocalDate.now());
		assertEquals(1,dao.addEmployee(emp));
	}
	
    @Test
    void testGetEmployeeByCode() {
        Optional<Employee> emp = dao.getEmployeeByCode(105);
        assertTrue(emp.isPresent());
      
    }
    
    @Test
    void testGetAllEmployees() {
        List<Employee> emplist = dao.getAllEmployees();
        assertNotNull(emplist);
        assertFalse(emplist.isEmpty());
    }

}
