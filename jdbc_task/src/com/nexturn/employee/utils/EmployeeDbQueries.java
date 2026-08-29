package com.nexturn.employee.utils;

public class EmployeeDbQueries {
    public static final String ADD_EMPL="Insert into employee values(?,?,?,?)";
    public static final String UPDATE_EMPL="UPDATE employee SET empname = ?,salary = ?, doj = ? WHERE empcode = ?";
    public static final String DELETE_EMPL="DELETE FROM employee WHERE empcode = ?";
public static final String GET_ALL_EMPL ="SELECT * FROM employee";
public static final String GET_EMP_BY_CODE="Select * from employee where empcode=?";
}
