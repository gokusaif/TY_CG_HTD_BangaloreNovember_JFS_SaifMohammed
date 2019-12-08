package com.caps.jdbc;


import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class EvolvedTest {
	public static void main(String[] args) {
		FileReader read=null;
		Properties prop=null;
		try {
			read= new FileReader("db.properties");
			prop= new Properties();
			prop.load(read);
			Class.forName(prop.getProperty("driverClass"));
			System.out.println("driver loaded....");
		} catch(Exception e) {
			e.printStackTrace();
		}
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt=con.createStatement();ResultSet rs=stmt.executeQuery(prop.getProperty("query1"))){
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
