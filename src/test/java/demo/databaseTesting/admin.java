package demo.databaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class admin {
	public static  void   main (String[]args) throws SQLException{

		String host="localhost";
		String port="3306";

		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/rajesh","rajesh","Rajesh@1992");

		Statement s= con.createStatement();
		ResultSet rs=	s.executeQuery("select username,password from tab1 where id=1;");
		while(rs.next()){
			System.out.println(rs.getString("username"));
			System.out.println(rs.getString("password"));
		}
	
	}
}
