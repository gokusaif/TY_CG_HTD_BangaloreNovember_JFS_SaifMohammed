package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			//load the driver
			Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("driver loaded");
			//establish db connection
			String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			String dbUname=sc.nextLine();
			String dbPass=sc.nextLine();
			con=DriverManager.getConnection(dbUrl, dbUname, dbPass);
			System.out.println("connection estd");
			
			//issue sql query
			String query="SELECT * FROM users_info";
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
