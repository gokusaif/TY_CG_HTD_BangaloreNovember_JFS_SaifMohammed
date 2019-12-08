package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NewUser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			//load driver
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("driver loaded");
			
			//get gb connection
			String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("enter username :"); 
			String user=sc.nextLine();
			System.out.println("enter password :");			
			String pass=sc.nextLine();
			con=DriverManager.getConnection(dbUrl, user, pass);
			System.out.println("estd connection");
		
			
			//issue sql query
		
			String query="INSERT into users_info values(?,?,?,?)";
			pstmt=con.prepareStatement(query);
			System.out.println("enter userid :");
			pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
			System.out.println("enter username :");
			pstmt.setString(2,sc.nextLine());
			System.out.println("enter email :");
			pstmt.setString(3,sc.nextLine());
			System.out.println("enter password :");
			pstmt.setString(4,sc.nextLine());
			
			
			
			//process the results returned by sql queries
			int r =pstmt.executeUpdate();
			
			if(r>0) {
				System.out.println("user created");
			}
			else {
				System.err.println("enter proper details");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		//close all jdbc objects
		finally {
			sc.close();
			//close all jdbc objects
				try {
					if(con!=null)
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					if(pstmt!=null)
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				System.out.println("objects closed");
		}
	}

}
