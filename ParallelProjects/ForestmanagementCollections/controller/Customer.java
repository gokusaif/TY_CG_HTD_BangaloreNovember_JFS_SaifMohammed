package com.cap.forestmanagement.controller;

import java.util.Scanner;

import com.cap.forestmanagement.dao.DAOCustomer;
import com.cap.forestmanagement.factory.Factory;

public class Customer {
	public static void main(String[] args) {
		DAOCustomer dao1=Factory.objectDAOCustomer();
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("Welcome customer ");
			System.out.println("--------------");
			System.out.println("Select the option to perform operations");
			System.out.println("Option 1: Add customer");
			System.out.println("Option 2: show all customers");
			System.out.println("Option 3: remove customer");
			System.out.println("Option 4: modify customer");
			System.out.println("Option 5: Home");
			int choice= sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Add Details of customer with same customer id");
				System.out.println("-------------------");
				System.out.println("Enter customer id");
				Integer customerid=sc.nextInt();
				System.out.println("Enter customer name");
				String customerName=sc.next();
				System.out.println("Enter customer address");
				String customerAddress=sc.next();
				System.out.println("Enter customer town");
				String customerTown=sc.next();
				System.out.println("Enter customer pin code");
				int customerZip=sc.nextInt();
				System.out.println("Enter customer email address");
				String customerEmail=sc.next();
				System.out.println("Enter customer phone number");
				int customerPhone=sc.nextInt();
			
			
				dao1.addCustomer(customerid, customerName, customerAddress, 
						customerTown, customerZip, customerEmail, customerPhone);
				break;
			case 2:
				System.out.println("----------");
				dao1.showCustomers();
				break;
			case 3:
				System.out.println("Enter customerid to remove customer details ");
				Integer customerid1=sc.nextInt();
				dao1.removeCustomer(customerid1);
				break;
			case 4:
				System.out.println("enter customerid to modify details");
				Integer customerid2=sc.nextInt();
				if(dao1.modifyDetails(customerid2)) {
					System.out.println("modify details of customer");
					System.out.println("-------------------");
					System.out.println("Enter customer name");
					String customerName1=sc.next();
					System.out.println("Enter customer address");
					String customerAddress1=sc.next();
					System.out.println("Enter customer town");
					String customerTown1=sc.next();
					System.out.println("Enter customer pin code");
					int customerZip1=sc.nextInt();
					System.out.println("Enter customer email address");
					String customerEmail1=sc.next();
					System.out.println("Enter customer phone number");
					int customerPhone1=sc.nextInt();
				dao1.addCustomer(customerid2, customerName1, customerAddress1, 
							customerTown1, customerZip1, customerEmail1, customerPhone1);	
				} else {
					System.out.println("customer not found");
				}
				break;
			case 5:
				App.main(args);
				break;
}
	}}}
