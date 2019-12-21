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




public class ClientDAOImpl implements ClientDAO{

	FileReader reader;
	Properties prop;
	ClientBean contr;
	Scanner sc=new Scanner(System.in);
	public ClientDAOImpl(){
		try {
			reader=new FileReader("client.properties");
			prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
		} catch(Exception e) {
			e.getMessage();
		} 
	}
	public boolean addContract(ClientBean client) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("insertQuery"))) {

			pstmt.setInt(1,client.getContractId());
			pstmt.setInt(2,client.getProductId());
			pstmt.setInt(3,client.getHaulierId());
			pstmt.setString(4,client.getDeliveryDate());
			pstmt.setString(5,client.getDeliveryDay());
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

	
	public boolean deleteContract(int contractId) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"), 
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("deleteQuery"))){
			pstmt.setInt(1,contractId);
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

	
	public List<ClientBean> showContracts() {
		List<ClientBean> l1= new ArrayList<ClientBean>();
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));Statement stmt=con.createStatement(); 
				ResultSet rs=stmt.executeQuery(prop.getProperty("query1"))){
			while(rs.next()) {
				contr= new ClientBean();
				contr.setContractId(rs.getInt(1));
				contr.setProductId(rs.getInt(2));
				contr.setHaulierId(rs.getInt(3));
				contr.setDeliveryDate(rs.getString(4));
				contr.setDeliveryDay(rs.getString(5));

				l1.add(contr);
			}
			return l1;

		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}


	public boolean updateProductId(int contractId,int productId) {


		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"), 
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("updateProductId"))) {


			pstmt.setInt(1,productId);
			pstmt.setInt(2,contractId);
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

	public boolean updateHaulierId(int contractId, int haulierId) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"), 
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("updateHaulierId"))) {


			pstmt.setInt(1,haulierId);
			pstmt.setInt(2,contractId);
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

	public boolean updateDeliveryDate(int contractId, String deliveryDate) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"), 
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("updateDeliveryDate"))) {


			pstmt.setString(1,deliveryDate);
			pstmt.setInt(2,contractId);
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
	public boolean updateDeliveryDay(int contractId, String deliveryDay) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"), 
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("updateDeliveryDay"))) {


			pstmt.setString(1,deliveryDay);
			pstmt.setInt(2,contractId);
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


	
	public boolean clientLogin(String username, String password) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("loginQuery"))) {

			pstmt.setString(1,username);
			pstmt.setString(2,password);

			ResultSet rs=pstmt.executeQuery();


			return rs.next();

		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;

	}
	
	public List<ClientBean> viewContracts(int contractId) {
		List<ClientBean> l1= new ArrayList<ClientBean>();
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));Statement stmt=con.createStatement(); 
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("selectQuery"))){
			pstmt.setInt(1,contractId);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				contr= new ClientBean();
				contr.setContractId(rs.getInt(1));
				contr.setProductId(rs.getInt(2));
				contr.setHaulierId(rs.getInt(3));
				contr.setDeliveryDate(rs.getString(4));
				contr.setDeliveryDay(rs.getString(5));

				l1.add(contr);
			}
			return l1;

		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}




}
