package day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestDb2 {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/nexturn26";
		Connection conn=DriverManager.getConnection(url, "root", "Ssadh12345@");
		Scanner sc =new Scanner(System.in);
		String qry="insert into sample values(?,?)";
		PreparedStatement pst= conn.prepareStatement(qry);
		System.out.println("Enter the code and name");
		pst.setInt(1, sc.nextInt());
		pst.setString(2, sc.nextLine());
		pst.executeUpdate();
		System.out.println("Inserted");

		
		
		
		
	}

}
