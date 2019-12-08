package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class EvolvedJDBC {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/ty_cg_nov6";
		System.out.println("enter the username and password");
		String user=sc.nextLine();
		String password=sc.nextLine();		
		String query="select * from users_info";
		try(Connection con=DriverManager.getConnection(url, user, password);Statement stmt=con.createStatement();
				ResultSet r=stmt.executeQuery(query))
				{
			while(r.next()) {
				System.out.println("userid:"+r.getInt(1));
				System.out.println("username:"+r.getString(2));
				System.out.println("email:"+r.getString(3));
			}
			sc.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
