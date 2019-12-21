package com.cap.forestmanagement.controller;

import java.util.Scanner;

import com.cap.forestmanagement.bean.CustomerDetails;
import com.cap.forestmanagement.dao.DAOCustomer;
import com.cap.forestmanagement.factory.Factory;

public class Customer {
	static DAOCustomer dao1=Factory.objectDAOCustomer();
	public static void main(String[] args) {
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
			String ch=null;
			char c = 'y';
			while(c=='y') {
				ch= sc.next();
				if(Validations.isNumber(ch)) {
					c='n';
				} else {
					System.err.println("enter numbers only");
				}
			} 
			Integer choice = Integer.parseInt(ch);
			
			switch(choice) {
			case 1:
				CustomerDetails details= new CustomerDetails();
				System.out.println("Add Details of customer with same customer id");
				System.out.println("-------------------");
				System.out.println("Enter customer id");
				details.setCustomerid(sc.nextInt());
				System.out.println("Enter customer name");
				details.setCustomerName(sc.next());
				System.out.println("Enter customer address");
				details.setCustomerAddress(sc.next());
				System.out.println("Enter customer town");
				details.setCustomerTown(sc.next());
				System.out.println("Enter customer pin code");
				details.setCustomerZip(sc.nextInt());
				System.out.println("Enter customer email address");
				details.setCustomerEmail(sc.next());
				System.out.println("Enter customer phone number");
				details.setCustomerPhone(sc.nextInt());


				dao1.addCustomer(details);
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
				Integer customerId=sc.nextInt();
				CustomerDetails modify =dao1.getDetails(customerId);
				if(modify!=null) {
					String brk = "yes";
					while(brk.equals("yes")) {
						System.out.println("modify details of customer");
						System.out.println("enter which detail to modify");
						System.out.println("1.Address\n 2.Email\n 3.Town\n 4.Pincode\n 5.PhoneNumber");
						int mod= sc.nextInt();
						switch(mod) {
						case 1:
							System.out.println("enter new address");
							modify.setCustomerAddress(sc.next());
							System.out.println("details updated");
							System.out.println("Do you want to modify other details?");
							System.out.println("Type yes to continue or any key to exit");
							brk=sc.next();
							break;
						case 2:
							System.out.println("enter new email");
							modify.setCustomerEmail(sc.next());
							System.out.println("details updated");
							System.out.println("Do you want to modify other details?");
							System.out.println("Type yes to continue or any key to exit");
							brk=sc.next();
							break;
						case 3:
							System.out.println("enter new town");
							modify.setCustomerTown(sc.next());
							System.out.println("details updated");
							System.out.println("Do you want to modify other details?");
							System.out.println("Type yes to continue or any key to exit");
							brk=sc.next();
							break;
						case 4:
							System.out.println("enter new pin code");
							modify.setCustomerZip(sc.nextInt());
							System.out.println("details updated");
							System.out.println("Do you want to modify other details?");
							System.out.println("Type yes to continue or any key to exit");
							brk=sc.next();
							break;
						case 5:
							System.out.println("enter new phone number");
							modify.setCustomerPhone(sc.nextInt());
							System.out.println("details updated");
							System.out.println("Do you want to modify other details?");
							System.out.println("Type yes to continue or any key to exit");
							brk=sc.next();
							break;
						default:
							System.out.println("enter valid option");
							break;
						} }
				} else {
					System.out.println("customer not found");
				}
				break;
			case 5:
				App.main(args);
				break;
			default:
				System.out.println("enter proper option");
				break;
			}
		}}}
