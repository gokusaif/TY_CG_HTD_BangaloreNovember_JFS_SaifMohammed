package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserLogin {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
			try {
				//load the driver
				Driver driver = new com.mysql.jdbc.Driver();
				DriverManager.registerDriver(driver);
				System.out.println("driver loaded");

				//establish db connection via driver
				String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6" ;
				System.out.print("enter username:");
				String dbUser=sc.nextLine();
				System.out.print("enter password:");
				String dbPass=sc.nextLine();
				conn=DriverManager.getConnection(dbUrl,dbUser,dbPass);
				System.out.println("connection estd");
				//issue sql query via connection

				String query="SELECT * FROM users_info WHERE userid=? and password=?";
				pstmt=conn.prepareStatement(query);
				System.out.println("enter userid :");
				pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
				System.out.println("enter password :");
				pstmt.setString(2,sc.nextLine());
				rs=pstmt.executeQuery();
				System.out.println("query executed");
				//process the results of sql query
				if(rs.next()) {
					System.out.println("user id:"+rs.getInt(1));
					System.out.println("user name:"+rs.getString(2));
					System.out.println("email:"+rs.getString(3));
				}
				else {
					System.err.println("enter proper details");
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			finally {
				//close all jdbc objects
					try {
						if(conn!=null)
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					try {
						if(pstmt!=null)
						pstmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					try {
						if(rs!=null)
						rs.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					System.out.println("objects closed");
			}
			
			
		
		
	}
}
