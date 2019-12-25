package com.capgemini.forestmanagement.controller;

import java.util.Scanner;

import com.capgemini.forestmanagement.bean.ClientBean;
import com.capgemini.forestmanagement.bean.SchedulerBean;
import com.capgemini.forestmanagement.bean.SchedulerLogin;
import com.capgemini.forestmanagement.factory.Factory;
import com.capgemini.forestmanagement.services.SchedulerServices;

public class Scheduler extends Admin{
	static SchedulerServices services = Factory.objectSchedulerServices();
	public static void main() {
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("*******Welcome Scheduler*********");
			System.out.println("Enter username");
			String user=sc.next();
			System.out.println("enter password");
			String pass=sc.next();
			if(services1.checkScheduler(user, pass)) {
				while(true) {
					System.out.println("Welcome Scheduler ");
					System.out.println("--------------");
					System.out.println("Select the option to perform operations");
					System.out.println("Option 1:Change password");
					System.out.println("Option 2: Add schedule");
					System.out.println("Option 3: show all schedules");
					System.out.println("Option 4: remove schedule");
					System.out.println("Option 5: modify schedule");
					System.out.println("Option 6: Show schedule");
					System.out.println("Option 7: Home");
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
						System.out.println("Enter new password");
						String password=sc.next();
						SchedulerLogin bean= new SchedulerLogin();
						bean.setUsername(user);
						bean.setPassword(password);
						services1.updateScheduler(bean);
						break;
					case 2:
						SchedulerBean details= new SchedulerBean();
						System.out.println("Add Details of schdeule");
						System.out.println("-------------------");
						System.out.println("Enter schedule id");
						String ch1=null;
						char c1 = 'y';
						while(c1=='y') {
							ch1= sc.next();
							if(Validations.isNumber(ch1)) {
								c1='n';
							} else {
								System.err.println("enter numbers only");
							}
						} 
						Integer id = Integer.parseInt(ch1);
						details.setId(id);
						System.out.println("Enter scheduler id");
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
						Integer id1 = Integer.parseInt(ch2);
						details.setId(id1);
						System.out.println("Enter product id");
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
						Integer id2 = Integer.parseInt(ch3);
						details.setProductId(id2);
						System.out.println("Enter quantity ");
						String quantity=null;
						char q = 'y';
						while(q=='y') {
							quantity= sc.next();
							if(Validations.isNumber(quantity)) {
								q='n';
							} else {
								System.err.println("enter numbers only");
							}
						} 
						details.setQuantity(Integer.parseInt(quantity));
						System.out.println("Enter transport type");
						String transport=null;
						char t = 'y';
						while(t=='y') {
							transport= sc.next();
							
							if(Validations.isStringOnlyAlphabet(transport)) {
								t='n';
							} else {
								System.err.println("enter only alphabets");
							}
						}
						details.setTransport(transport);
						System.out.println("Enter delivery date");
						String date=null;
						char d = 'y';
						while(d=='y') {
							date= sc.next();
							if(Validations.isValidDate(date)) {
								System.err.println("enter valid date in format dd/mm/yyyy ");
							} else {
								d='n';
							}
						} 
						details.setDeliveryDate(date);
						services.addSchedule(details);
						break;
					case 3:
						System.out.println("----------");
						services.showSchedules();
						break;
					case 4:
						System.out.println("Enter schedule id to remove schedule ");
						String ch4=null;
						char c4 = 'y';
						while(c4=='y') {
							ch4= sc.next();
							if(Validations.isNumber(ch4)) {
								c4='n';
							} else {
								System.err.println("enter numbers only");
							}
						} 
						Integer id3 = Integer.parseInt(ch4);
						services.removeSchedule(id3);
						break;
					case 5:
						System.out.println("enter customerid to modify details");
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
						Integer id4 = Integer.parseInt(ch5);
						SchedulerBean modify=services.getSchedule(id4);
						if(modify!=null) {
							String brk = "yes";
							while(brk.equals("yes")) {
								System.out.println("modify details of schedule");
								System.out.println("enter which detail to modify");
								System.out.println("1.Product id\n 2.Quantity\n 3.Transport\n 4.DeliveryDate");
								int mod= sc.nextInt();
								switch(mod) {
								case 1:
									System.out.println("enter new product id");
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
									Integer id5 = Integer.parseInt(ch6);
									modify.setProductId(id5);
									System.out.println("Schedule modified");
									System.out.println("Do you want to modify other details?");
									System.out.println("Type yes to continue or any key to exit");
									brk=sc.next();
									break;
								case 2:
									System.out.println("enter quantity to update");
									String quantity1=null;
									char q1 = 'y';
									while(q1=='y') {
										quantity1= sc.next();
										if(Validations.isNumber(quantity1)) {
											q1='n';
										} else {
											System.err.println("enter numbers only");
										}
									} 
									modify.setQuantity(Integer.parseInt(quantity1));
									System.out.println("Schedule modified");
									System.out.println("Do you want to modify other details?");
									System.out.println("Type yes to continue or any key to exit");
									brk=sc.next();
									break;
								case 3:
									System.out.println("enter new transport type");
									String transport1=null;
									char t1 = 'y';
									while(t1=='y') {
										transport1= sc.next();
										
										if(Validations.isStringOnlyAlphabet(transport1)) {
											t1='n';
										} else {
											System.err.println("enter only alphabets");
										}
									}
									modify.setTransport(transport1);
									System.out.println("Do you want to modify other details?");
									System.out.println("Type yes to continue or any key to exit");
									brk=sc.next();
									break;
								case 4:
									System.out.println("enter new delivery date");
									String date1=null;
									char d1 = 'y';
									while(d1=='y') {
										date1= sc.next();
										if(Validations.isValidDate(date1)) {
											System.err.println("enter valid date in format dd/mm/yyyy ");
										} else {
											d1='n';
										}
									} 
									modify.setDeliveryDate(date1);
									System.out.println("Do you want to modify other details?");
									System.out.println("Type yes to continue or any key to exit");
									brk=sc.next();
									break;
								default:
									System.out.println("enter valid option");
									break;
								} }
						} else {
							System.out.println("schedule not found");
						}
						break;
					case 6:
						System.out.println("Enter schedule id to display details");
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
						SchedulerBean bean1=services.getSchedule(Integer.parseInt(search));
						if(bean1!=null) {
							System.out.println(bean1);
						} else {
							System.out.println("Schedule details not found");
						}
						break;
					case 7:
						String args[] =null;
						App.main(args);
						break;
					default:
						System.out.println("enter proper option");
						break;
					} } }
			else {
				System.out.println("Enter valid credentials");
				System.out.println("Dont have an account? type yes to ask admin to create account type anything to try again");
				String reply=sc.next();
				if(reply.equals("yes")) {
					Admin.adminMain();
				}
			}
		}

	} }
