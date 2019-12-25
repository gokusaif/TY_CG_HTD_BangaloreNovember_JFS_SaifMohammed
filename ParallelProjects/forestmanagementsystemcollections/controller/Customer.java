package com.capgemini.forestmanagement.controller;

import java.util.Scanner;

import com.capgemini.forestmanagement.bean.CustomerDetails;
import com.capgemini.forestmanagement.dao.DAOCustomer;
import com.capgemini.forestmanagement.factory.Factory;
import com.capgemini.forestmanagement.services.CustomerServices;

public class Customer {
	static CustomerServices services = Factory.objectCustomerServices();
	public static void main() {
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("Customer operations ");
			System.out.println("--------------");
			System.out.println("Select the option to perform operations");
			System.out.println("Option 1: Add customer");
			System.out.println("Option 2: show all customers");
			System.out.println("Option 3: remove customer");
			System.out.println("Option 4: modify customer");
			System.out.println("Option 5: Show customer details");
			System.out.println("Option 6: Home");
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
				System.out.println("Add Details of customer ");
				System.out.println("-------------------");
				System.out.println("Enter customer id");
				String ch2=null;
				char c2 = 'y';
				while(c2=='y') {
					ch2= sc.next();
					if(Validations.isNumber(ch2)) {
						c2='n';
					} else {
						System.err.println("enter numbers only");
					}
				}
				Integer id= Integer.parseInt(ch2);
				details.setCustomerid(id);
				System.out.println("Enter customer name");
				String na=null;
				char n = 'y';
				while(n=='y') {
					na= sc.next();
					
					if(Validations.isStringOnlyAlphabet(na)) {
						n='n';
					} else {
						System.err.println("enter only alphabets");
					}
				}
				details.setCustomerName(na);
//				sc.next();
				System.out.println("Enter customer address");
				details.setCustomerAddress(sc.next());
				System.out.println("Enter customer town");
				String na1=null;
				char n1 = 'y';
				while(n1=='y') {
					na1= sc.next();
					
					if(Validations.isStringOnlyAlphabet(na1)) {
						n1='n';
					} else {
						System.err.println("enter only alphabets");
					}
				}
				details.setCustomerTown(na1);
				System.out.println("Enter customer pin code");
				String ch3=null;
				char c3 = 'y';
				while(c3=='y') {
					ch3= sc.next();
					if(Validations.isNumber(ch3)) {
						c3='n';
					} else {
						System.err.println("enter numbers only");
					}
				}
				Integer zip= Integer.parseInt(ch3);
				details.setCustomerZip(zip);
				System.out.println("Enter customer email address");
				String em=null;
				char ce = 'y';
				while(ce=='y') {
					em= sc.next();
					if(Validations.isEmail(em)) {
						ce='n';
					} else {
						System.err.println("enter valid email");
					}
				}
				details.setCustomerEmail(em);
				System.out.println("Enter customer phone number");
				String ch4=null;
				char c4 = 'y';
				while(c4=='y') {
					ch4= sc.next();
					if(Validations.validPhone(ch4)) {
						c4='n';
					} else {
						System.err.println("enter valid phone number");
					}
				}
				Long num= Long.parseLong(ch4);
				details.setCustomerPhone(num);
				services.addCustomer(details);
				break;
			case 2:
				System.out.println("----------");
				services.showCustomers();
				break;
			case 3:
				System.out.println("Enter customerid to remove customer details ");
				String ch5=null;
				char c5 = 'y';
				while(c5=='y') {
					ch5= sc.next();
					if(Validations.isNumber(ch5)) {
						c5='n';
					} else {
						System.err.println("enter numbers only");
					}
				}
				Integer id1= Integer.parseInt(ch5);
				services.removeCustomer(id1);
				break;
			case 4:
				System.out.println("enter customerid to modify details");
				String ch6=null;
				char c6 = 'y';
				while(c6=='y') {
					ch6= sc.next();
					if(Validations.isNumber(ch6)) {
						c6='n';
					} else {
						System.err.println("enter numbers only");
					}
				}
				Integer id2= Integer.parseInt(ch6);
				CustomerDetails modify =services.getDetails(id2);
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
							String em1=null;
							char ce1 = 'y';
							while(ce1=='y') {
								em1= sc.next();
								if(Validations.isEmail(em1)) {
									ce1='n';
								} else {
									System.err.println("enter valid email");
								}
							}
							modify.setCustomerEmail(em1);
							System.out.println("details updated");
							System.out.println("Do you want to modify other details?");
							System.out.println("Type yes to continue or any key to exit");
							brk=sc.next();
							break;
						case 3:
							System.out.println("enter new town");
							String na3=null;
							char n3 = 'y';
							while(n3=='y') {
								na3= sc.next();
								
								if(Validations.isStringOnlyAlphabet(na3)) {
									n3='n';
								} else {
									System.err.println("enter only alphabets");
								}
							}
							modify.setCustomerTown(na3);
							System.out.println("details updated");
							System.out.println("Do you want to modify other details?");
							System.out.println("Type yes to continue or any key to exit");
							brk=sc.next();
							break;
						case 4:
							System.out.println("enter new pin code");
							String ch7=null;
							char c7 = 'y';
							while(c7=='y') {
								ch7= sc.next();
								if(Validations.isNumber(ch7)) {
									c7='n';
								} else {
									System.err.println("enter numbers only");
								}
							}
							Integer id3= Integer.parseInt(ch7);
							modify.setCustomerZip(id3);
							System.out.println("details updated");
							System.out.println("Do you want to modify other details?");
							System.out.println("Type yes to continue or any key to exit");
							brk=sc.next();
							break;
						case 5:
							System.out.println("enter new phone number");
							String ch8=null;
							char c8 = 'y';
							while(c8=='y') {
								ch8= sc.next();
								if(Validations.validPhone(ch8)) {
									c8='n';
								} else {
									System.err.println("enter valid phone number");
								}
							}
							Long id4= Long.parseLong(ch8);
							modify.setCustomerPhone(id4);
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
				System.out.println("Enter customer id to display details");
				String search=null;
				char s = 'y';
				while(s=='y') {
					search= sc.next();
					if(Validations.isNumber(search)) {
						s='n';
					} else {
						System.err.println("enter numbers only");
					}
				}
				CustomerDetails bean=services.getDetails(Integer.parseInt(search));
				if(bean!=null) {
					System.out.println(bean);
				} else {
					System.out.println("Customer details not found");
				}
				break;
			case 6:
				Client.main();
				break;
			default:
				System.out.println("enter proper option");
				break;
			}
		}}}