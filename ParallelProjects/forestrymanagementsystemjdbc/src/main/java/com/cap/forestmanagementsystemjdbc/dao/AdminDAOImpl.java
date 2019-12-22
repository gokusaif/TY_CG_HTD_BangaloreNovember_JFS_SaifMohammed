package com.cap.forestmanagementsystemjdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.cap.forestmanagementsystemjdbc.bean.AdminBean;
import com.cap.forestmanagementsystemjdbc.bean.ProductBean;


public class AdminDAOImpl implements AdminDAO{
	
	FileReader reader;
	Properties prop;
	AdminBean admin1;
	
	public AdminDAOImpl(){
		try {
			reader=new FileReader("admin.properties");
			prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
		} catch(Exception e) {
			e.getMessage();
		} 
	}

	
	public boolean addClient(AdminBean admin) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("insertQuery"))) {

			pstmt.setString(1,admin.getClientUserName());
			pstmt.setString(2,admin.getClientPassword());
		
			int count=pstmt.executeUpdate();

			if(count >0) {
				return true;
			} else {
				return false;
			}

		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	
	public boolean removeClient(String userName) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"), 
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("deleteQuery"))){
			pstmt.setString(1,userName);
			int r=pstmt.executeUpdate();
			if(r>0) {
				return true;
			} else {
				return false;
			}
			
		}catch(Exception e) {
			e.getMessage();
		}
		return false;
		
	}

	
	public List<AdminBean> showClients() {
		List<AdminBean> l1= new ArrayList<AdminBean>();
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));Statement stmt=con.createStatement(); 
				ResultSet rs=stmt.executeQuery(prop.getProperty("query1"))){
			while(rs.next()) {
				admin1= new AdminBean();
				admin1.setClientUserName(rs.getString(1));
				l1.add(admin1);
			}
			return l1;

		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}

}
