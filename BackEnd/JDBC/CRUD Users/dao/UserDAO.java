package com.capgemini.jdbc.dao;

import java.util.List;

import com.capgemini.jdbc.bean.UserBean;

public interface UserDAO {
	public List<UserBean> getAllUsers();   // get all users info
	
	public UserBean userLogin(String username,String password); //login to database
	
	public boolean updateUser(int userid,String password,String email); //update email
	
	public boolean deleteUser(int userid,String password);// delete single user
	
	public boolean insertUser(UserBean user); // add new user

}
