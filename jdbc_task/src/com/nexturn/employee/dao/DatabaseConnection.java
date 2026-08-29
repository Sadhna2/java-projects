package com.nexturn.employee.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection conn;
    public static Connection getDbConnection () {
    	   String url= "jdbc:mysql://localhost:3306/nexturn26";
    	   try {
			conn=DriverManager.getConnection(url,"root","Ssadh12345@");
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	   return conn;
    }
    
    public static void close() {
    	    try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
    }
}
