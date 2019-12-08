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

import com.cap.forestmanagementsystemjdbc.bean.ProductBean;



public class ProductDAOImpl implements ProductDAO {
	FileReader reader;
	Properties prop;
	ProductBean prod;
	
	public ProductDAOImpl(){
		try {
			reader=new FileReader("product.properties");
			prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
		} catch(Exception e) {
			e.getMessage();
		} 
	}


	public boolean insertProduct(ProductBean prod) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("insertQuery"))) {

			pstmt.setString(1,prod.getProductName());
			pstmt.setInt(2,prod.getProductId());
			pstmt.setString(3,prod.getProductQuantity());
		
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


	@Override
	public boolean deleteProduct(int productId) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"), 
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("deleteQuery"))){
			pstmt.setInt(1,productId);
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


	public List<ProductBean> showProducts() {
		List<ProductBean> l1= new ArrayList<ProductBean>();
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));Statement stmt=con.createStatement(); 
				ResultSet rs=stmt.executeQuery(prop.getProperty("query1"))){
			while(rs.next()) {
				prod= new ProductBean();
				prod.setProductName(rs.getString(1));
				prod.setProductId(rs.getInt(2));
				prod.setProductQuantity(rs.getString(3));
				l1.add(prod);
			}
			return l1;

		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}


	@Override
	public boolean updateProduct(int productId,String quantity) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"), 
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("updateQuery"))){
			pstmt.setString(1,quantity);
			pstmt.setInt(2,productId);
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


	@Override
	public List<ProductBean> viewProducts(int productId) {
		List<ProductBean> l1= new ArrayList<ProductBean>();
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));Statement stmt=con.createStatement(); 
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("selectQuery"))){
			pstmt.setInt(1,productId);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				prod= new ProductBean();
				prod.setProductName(rs.getString(1));
				prod.setProductId(rs.getInt(2));
				prod.setProductQuantity(rs.getString(3));
				l1.add(prod);
			}
			return l1;

		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	
}
