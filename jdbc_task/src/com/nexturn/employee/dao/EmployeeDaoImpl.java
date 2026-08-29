package com.nexturn.employee.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import com.nexturn.employee.beans.Employee;
import com.nexturn.employee.utils.EmployeeDbQueries;

public class EmployeeDaoImpl implements EmployeeDao {
    Connection connection;
    PreparedStatement pst;
    ResultSet result;
	@Override
	public int addEmployee(Employee employee) {
		int rows=0;
		connection=DatabaseConnection.getDbConnection();
		try {
			pst=connection.prepareStatement(EmployeeDbQueries.ADD_EMPL);
			pst.setInt(1, employee.getEmpcode());
			pst.setString(2, employee.getEmpname());
			pst.setDouble(3, employee.getSalary());
			pst.setDate(4,Date.valueOf(employee.getDoj()));
			rows=pst.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			DatabaseConnection.close();
		}
		return rows;
	}
	
	@Override
	public Optional<Employee> getEmployeeByCode(int empcode) {
	    Employee emp = null;
	    connection = DatabaseConnection.getDbConnection();
	    try {
	        pst = connection.prepareStatement(EmployeeDbQueries.GET_EMP_BY_CODE);
	        pst.setInt(1, empcode);
	        result = pst.executeQuery();
	        result.next();
	            emp = new Employee();
	            emp.setEmpcode(result.getInt("empcode"));
	            emp.setEmpname(result.getString("empname"));
	            emp.setSalary(result.getDouble("salary"));
	            emp.setDoj(result.getDate("doj").toLocalDate());
	        
	    } catch (SQLException e) {
	      // e.printStackTrace();
	        return null;
	    }
	    
	    finally {
	        DatabaseConnection.close();
	    }

	    return Optional.ofNullable(emp);
	}
	@Override
	public List<Employee> getAllEmployees() {
	    List<Employee> emplist = new ArrayList<>();
	    connection = DatabaseConnection.getDbConnection();
	    try {
	        pst = connection.prepareStatement(EmployeeDbQueries.GET_ALL_EMPL);
	        result = pst.executeQuery();
	        while (result.next()) {
	            Employee emp = new Employee();
	            emp.setEmpcode(result.getInt("empcode"));
	            emp.setEmpname(result.getString("empname"));
	            emp.setSalary(result.getDouble("salary"));
	            emp.setDoj(result.getDate("doj").toLocalDate());
	            emplist.add(emp);
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        DatabaseConnection.close();
	    }
	    return emplist;
	}

	@Override
	public int updateEmployee(Employee employee) {
	    int rows = 0;
	    connection = DatabaseConnection.getDbConnection();
	    try {
	        pst = connection.prepareStatement(
	            EmployeeDbQueries.UPDATE_EMPL
	        );
	        pst.setString(1, employee.getEmpname());
	        pst.setDouble(2, employee.getSalary());
	        pst.setDate(3, Date.valueOf(employee.getDoj()));
	        pst.setInt(4, employee.getEmpcode());

	        rows = pst.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        DatabaseConnection.close();
	    }
	    return rows;
	}

	@Override
	public int deleteEmployee(int empcode) {
	    int rows = 0;
	    connection = DatabaseConnection.getDbConnection();
	    try {
	        pst = connection.prepareStatement(
	            EmployeeDbQueries.DELETE_EMPL
	        );
	        pst.setInt(1, empcode);
	        rows = pst.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        DatabaseConnection.close();
	    }
	    return rows;
	}
	
	
}
