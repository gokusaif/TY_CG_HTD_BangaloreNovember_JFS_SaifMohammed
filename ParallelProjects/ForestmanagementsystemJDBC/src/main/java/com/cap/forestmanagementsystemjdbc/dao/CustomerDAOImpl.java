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
import java.util.Scanner;

import com.cap.forestmanagementsystemjdbc.bean.ClientBean;
import com.cap.forestmanagementsystemjdbc.bean.CustomerBean;

public class CustomerDAOImpl implements CustomerDAO{

	FileReader reader;
	Properties prop;
	CustomerBean cust;
	Scanner sc=new Scanner(System.in);
	public CustomerDAOImpl(){
		try {
			reader=new FileReader("customer.properties");
			prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
		} catch(Exception e) {
			e.getMessage();
		} 
	}

	
	public boolean addCustomer(CustomerBean customer) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("insertQuery"))) {

			pstmt.setInt(1,customer.getCustomerid());
			pstmt.setString(2,customer.getCustomerName());
			pstmt.setString(3,customer.getCustomerAddress());
			pstmt.setString(4,customer.getCustomerTown());
			pstmt.setInt(5,customer.getCustomerZip());
			pstmt.setString(6,customer.getCustomerEmail());
			pstmt.setString(7,customer.getCustomerPhone());
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

	
	public boolean deleteCustomer(int customerId) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"), 
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("deleteQuery"))){
			pstmt.setInt(1,customerId);
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

	
	public List<CustomerBean> showCustomers() {
		List<CustomerBean> l1= new ArrayList<CustomerBean>();
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));Statement stmt=con.createStatement(); 
				ResultSet rs=stmt.executeQuery(prop.getProperty("query1"))){
			while(rs.next()) {
				cust= new CustomerBean();
				cust.setCustomerid(rs.getInt(1));
				cust.setCustomerName(rs.getString(2));
				cust.setCustomerAddress(rs.getString(3));
				cust.setCustomerTown(rs.getString(4));
				cust.setCustomerZip(rs.getInt(5));
				cust.setCustomerEmail(rs.getString(6));
				cust.setCustomerPhone(rs.getString(7));
				l1.add(cust);
			}
			return l1;

		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}

	
	public boolean updateAddress(CustomerBean cust2) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"), 
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("updateAddress"))) {

			pstmt.setString(1,cust2.getCustomerAddress());
			pstmt.setString(2,cust2.getCustomerTown());
			pstmt.setInt(3,cust2.getCustomerZip());
			pstmt.setInt(4,cust2.getCustomerid());
			int r=pstmt.executeUpdate();
			if(r>0) {
				return true;
			} else {
				System.out.println("enter valid contract id");
			} } catch(Exception e) {
				e.getMessage();
			}
		return false;
	}

	
	public boolean updateContact(CustomerBean cust1) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"), 
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("updateContact"))) {

			pstmt.setString(1,cust1.getCustomerEmail());
			pstmt.setString(2,cust1.getCustomerPhone());
			pstmt.setInt(3,cust1.getCustomerid());
			int r=pstmt.executeUpdate();
			if(r>0) {
				return true;
			} else {
				System.out.println("enter valid customer id");
			} } catch(Exception e) {
				e.getMessage();
			}
		return false;
	}

	
	public List<CustomerBean> viewCusstomers(int customerId) {
		List<CustomerBean> l1= new ArrayList<CustomerBean>();
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));Statement stmt=con.createStatement(); 
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("selectQuery"))){
			pstmt.setInt(1,customerId);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				cust= new CustomerBean();
				cust.setCustomerid(rs.getInt(1));
				cust.setCustomerName(rs.getString(2));
				cust.setCustomerAddress(rs.getString(3));
				cust.setCustomerTown(rs.getString(4));
				cust.setCustomerZip(rs.getInt(5));
				cust.setCustomerEmail(rs.getString(6));
				cust.setCustomerPhone(rs.getString(7));
				l1.add(cust);
			}
			return l1;

		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
