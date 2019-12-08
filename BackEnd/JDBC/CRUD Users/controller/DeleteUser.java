package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class DeleteUser {
	public static void main(String[] args) {
		UserServices services = UserFactory.instanceOfUserServices();
		UserBean user= new UserBean();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter userid");
		user.setUserid(Integer.parseInt(sc.nextLine()));
		System.out.println("enter password");
		user.setPassword(sc.nextLine());
		boolean ret=services.deleteUser(user.getUserid(),user.getPassword());
		if(ret) {
			System.out.println("user deleted");
		} else {
			System.err.println("something went wrong");
		}
}
}
