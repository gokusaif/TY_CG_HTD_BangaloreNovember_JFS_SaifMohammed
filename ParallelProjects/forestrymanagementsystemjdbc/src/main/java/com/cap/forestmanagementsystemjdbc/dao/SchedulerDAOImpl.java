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


import com.cap.forestmanagementsystemjdbc.bean.SchedulerBean;

public class SchedulerDAOImpl implements SchedulerDAO{
	
	FileReader reader;
	Properties prop;
	SchedulerBean sch;
	
	public SchedulerDAOImpl(){
		try {
			reader=new FileReader("scheduler.properties");
			prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
		} catch(Exception e) {
			e.getMessage();
		} 
	}

	
	public boolean deleteSchedule(int scheduleId) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"), 
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("deleteQuery"))){
			pstmt.setInt(1,scheduleId);
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

	
	public boolean insertSchedule(SchedulerBean sch) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("insertQuery"))) {

			pstmt.setInt(1,sch.getSchedulerId());
			pstmt.setString(2,sch.getTransport());
			pstmt.setString(3,sch.getDate());
			pstmt.setInt(4,sch.getProductId());
			pstmt.setString(5,sch.getQuantity());

		
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

	
	public List<SchedulerBean> showSchedules() {
		List<SchedulerBean> l1= new ArrayList<SchedulerBean>();
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));Statement stmt=con.createStatement(); 
				ResultSet rs=stmt.executeQuery(prop.getProperty("query1"))){
			while(rs.next()) {
				sch= new SchedulerBean();
				sch.setSchedulerId(rs.getInt(1));
				sch.setTransport(rs.getString(2));
				sch.setDate(rs.getString(3));
				sch.setProductId(rs.getInt(4));
				sch.setQuantity(rs.getString(5));
				l1.add(sch);
			}
			return l1;

		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	
	public boolean updateSchedule(int scheduleId, String quantity) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"), 
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("updateQuery"))){
			pstmt.setString(1,quantity);
			pstmt.setInt(2,scheduleId);
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

	
	public boolean updateSchedule1(int scheduleId, String date) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"), 
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("updateQuery1"))){
			pstmt.setString(1,date);
			pstmt.setInt(2,scheduleId);
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

	
	public List<SchedulerBean> viewSchedules(int schedulerId) {
		
		List<SchedulerBean> l1= new ArrayList<SchedulerBean>();
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));Statement stmt=con.createStatement(); 
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("selectQuery"))){
			pstmt.setInt(1,schedulerId);
			ResultSet rs= pstmt.executeQuery();
			while(rs.next()) {
				sch= new SchedulerBean();
				sch.setSchedulerId(rs.getInt(1));
				sch.setTransport(rs.getString(2));
				sch.setDate(rs.getString(3));
				sch.setProductId(rs.getInt(4));
				sch.setQuantity(rs.getString(5));
				l1.add(sch);
			}
			return l1;

		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
