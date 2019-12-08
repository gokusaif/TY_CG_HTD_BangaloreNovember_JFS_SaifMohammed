package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserEmailUpdate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		PreparedStatement pstmt=null;
		//load the driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded...");

			//get the dbconnection via driver
			String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6";
			System.out.print("enter username:");
			String dbUser=sc.nextLine();
			System.out.print("enter password:");
			String dbPass=sc.nextLine();
			con=DriverManager.getConnection(dbUrl, dbUser, dbPass);
			System.out.println("connection established.....");

			//issue the sql query via connection
			String query="UPDATE users_info set email=? WHERE userid=? and password=?";
			pstmt=con.prepareStatement(query);
			System.out.println("Enter userid");
			pstmt.setInt(2,Integer.parseInt(sc.nextLine()));
			System.out.println("Enter new email");
			pstmt.setString(1,sc.nextLine());
			System.out.println("Enter password");
			pstmt.setString(3,sc.nextLine());
			System.out.println("query issued");

			//process the results returned by sql query
			int r=pstmt.executeUpdate();
			if(r>0) {
				System.out.println("query ok "+r+" rows affected ");
			} else {
				System.err.println("check credentials");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		//close all jdbc objects
		finally {
			sc.close();
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
