package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		Statement stmt =null;
		ResultSet rs=null;
		
		try {
			//load the driver
			Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("driver loaded");
			
			//estd connection
			String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6";
			System.out.print("enter username:");
			String dbUname=sc.nextLine();
			System.out.print("enter password:");
			String dbPass=sc.nextLine();
			con=DriverManager.getConnection(dbUrl, dbUname, dbPass);
			System.out.println("connection estd");
			
			//issue sql query
			String query="SELECT * FROM users_info";
			  stmt= con.createStatement();
			 rs= stmt.executeQuery(query);
			 System.out.println("query issued and executed");
			 //process the results
			 
			 while(rs.next()) {
				 System.out.println("----");
				 System.out.println("userid :"+rs.getInt("userid"));
				 System.out.println("username:"+rs.getString("username"));
				 System.out.println("email:"+rs.getString("email"));
			 }
			

			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
				try {
					if(con!=null)
					con.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				try {
					if(stmt!=null)
					stmt.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				try {
					if(rs!=null)
					rs.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				System.out.println("jdbc objects closed");
		}
	}

}
