package com.caps.jdbc;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class MyFirstJDBC {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
	
	try {
		//Load the driver
//		Driver driver = new com.mysql.jdbc.Driver();
//		DriverManager.registerDriver(driver);
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver loaded");
		
		//Get the DBconnection
		String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6" ;
		String dbUser=sc.nextLine();
		String dbPass=sc.nextLine();
		conn=DriverManager.getConnection(dbUrl,dbUser,dbPass);
		System.out.println("connection estd");
		
		//issue sql statements via connection
		String query="SELECT * FROM users_info";
		stmt=conn.createStatement();
		rs=stmt.executeQuery(query);
		System.out.println("query issued");

		//process the sql results (result set is object rep of res table)
		while(rs.next()) {
			System.out.println("---------------------");
			System.out.println("Userid :"+ rs.getInt("userid"));
			System.out.println("Username :"+rs.getString("username"));
			System.out.println("Email :"+rs.getString("email"));
			System.out.println("----------------------");
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		//close jdbc objects
		
			try {
				if(conn!= null) 
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			try {
				if(stmt!= null) 
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			try {
				if(rs!= null) 
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("jdbc objects closed");
	}	
}
}
