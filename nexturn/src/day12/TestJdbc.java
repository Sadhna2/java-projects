package day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class TestJdbc {
	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new Driver());
		String url = "jdbc:mysql://localhost:3306/nexturn26";
		Connection conn=DriverManager.getConnection(url, "root", "Ssadh12345@");
		System.out.println("connected to mysql");
		Statement st=conn.createStatement();
		String qry="insert into sample values(101,'nexturn')";
		st.execute(qry);
		System.out.println("Inserted");
		
		
		
		
		
		
		
		
		
		
	}
}