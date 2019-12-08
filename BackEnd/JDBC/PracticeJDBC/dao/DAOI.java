package dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import bean.BeanClass;

public class DAOI implements DAO{
	FileReader reader;
	Properties prop;
	BeanClass bean;
	
	public DAOI(){
		try {
			reader= new FileReader("db.properties");
			prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("dbdriver"));
		} catch (Exception e) {
			System.out.println("something is wrong in constructor");
		}
	}

	@Override
	public List<BeanClass> getAll() {
		List<BeanClass> l1 = new ArrayList<BeanClass>();
		try(Connection con=DriverManager.getConnection(prop.getProperty("dburl"), prop.getProperty("dbuser"),
				prop.getProperty("dbpass"));Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query"))){
			while(rs.next()) {
				bean =new BeanClass();
				bean.setUserid(rs.getInt(1));
				bean.setUsername(rs.getString(2));
				bean.setEmail(rs.getString(3));
				l1.add(bean);
			}
			return l1;
			
		}catch(Exception e) {
			System.out.println("something is wrong in get all method");
		}
		return null;
	}

}
