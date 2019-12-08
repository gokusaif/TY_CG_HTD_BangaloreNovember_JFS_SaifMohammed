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

import com.cap.forestmanagementsystemjdbc.bean.LandBean;



public class LandDAOImpl implements LandDAO{
	
	FileReader reader;
	Properties prop;
	LandBean land;
	
	public LandDAOImpl(){
		try {
			reader=new FileReader("land.properties");
			prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
		} catch(Exception e) {
			e.getMessage();
		} 
	}

	@Override
	public boolean deleteLandDetails(int landId) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"), 
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("deleteQuery"))){
			pstmt.setInt(1,landId);
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
	public boolean addLandDetails(LandBean land) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("insertQuery"))) {
			pstmt.setInt(1,land.getLandId());
			pstmt.setString(2,land.getLandLocation());
			pstmt.setInt(3,land.getLandValue());
			pstmt.setString(4,land.getAcquiredDate());
		
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
	public List<LandBean> showLandDetails() {
		List<LandBean> l1= new ArrayList<LandBean>();
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));Statement stmt=con.createStatement(); 
				ResultSet rs=stmt.executeQuery(prop.getProperty("query1"))){
			while(rs.next()) {
				land= new LandBean();
				land.setLandId(rs.getInt(1));
				land.setLandLocation(rs.getString(2));
				land.setLandValue(rs.getInt(3));
				land.setAcquiredDate(rs.getString(4));
				l1.add(land);
			}
			return l1;

		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public boolean updateLandDetails(int landId, int landValue) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"), 
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("updateQuery"))){
			pstmt.setInt(1,landValue);
			pstmt.setInt(2,landId);
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
	public List<LandBean> viewLandDetails(int landId) {
		List<LandBean> l1= new ArrayList<LandBean>();
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));Statement stmt=con.createStatement(); 
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("selectQuery"))){
			pstmt.setInt(1,landId);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				land= new LandBean();
				land.setLandId(rs.getInt(1));
				land.setLandLocation(rs.getString(2));
				land.setLandValue(rs.getInt(3));
				land.setAcquiredDate(rs.getString(4));
				l1.add(land);
			}
			return l1;

		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
