package day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TestDb3 {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/nexturn26";
		Connection conn=DriverManager.getConnection(url,"root","Ssadh12345@");
		Scanner sc=new Scanner(System.in);
		String query ="update sample set name=? where code=?";
		PreparedStatement pst=conn.prepareStatement(query);
		pst.setString(1, "nicmar");
		pst.setInt(2, 201);
		int rows=pst.executeUpdate();
		if(rows>0)
			System.out.println("updated");
		else 
			System.out.println("not updated");
        query ="delete from sample where code=?";
        pst=conn.prepareStatement(query);
        pst.setInt(1, 201);
        rows=pst.executeUpdate();
        if(rows>0) System.out.println("deleted");
        else System.out.println("not deleted");
        
	}

}
