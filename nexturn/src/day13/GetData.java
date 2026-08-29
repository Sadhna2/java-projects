package day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;



public class GetData {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/nexturn26";
		Connection conn=DriverManager.getConnection(url, "root", "Ssadh12345@");
		String query ="select * from sample";
		PreparedStatement pst=conn.prepareStatement(query);
		ResultSet result=pst.executeQuery();
		ResultSetMetaData meta=result.getMetaData();
		for(int i=1;i<meta.getColumnCount();i++) {
			System.out.println(meta.getColumnName(i)+"\t");
		}
		System.out.println("\n-------------");
		while(result.next())
			System.out.println(result.getInt(1)+"\t"+result.getString("name"));
		query ="select * from sample where code=?";
		pst=conn.prepareStatement(query);
		pst.setInt(1, 349);
		result=pst.executeQuery();
		if(result.next())
			System.out.println(result.getInt(1)+"\t"+result.getString("name"));
		else System.out.println("record not found");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
