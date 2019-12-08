package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteUser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			//load driver
//			Driver driver = new com.mysql.jdbc.Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded");
			//get gb connection
			String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("enter username and password");
			String user=sc.nextLine();
			String pass=sc.nextLine();
			con=DriverManager.getConnection(dbUrl, user, pass);
			System.out.println("estd connection");
			
			//issue sql query
			String query="DELETE from users_info where userid=? and password=?";
			pstmt=con.prepareStatement(query);
			System.out.println("enter userid :");
			pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
			System.out.println("enter password :");
			pstmt.setString(2,sc.nextLine());
			//process the results returned by sql queries
			int r =pstmt.executeUpdate();
			if(r>0) {
				System.out.println("user deleted");
			}
			else {
				System.err.println("enter proper details");
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		//close all jdbc objects
		finally {
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
