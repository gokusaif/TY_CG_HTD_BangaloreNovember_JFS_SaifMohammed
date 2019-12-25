package com.capgemini.forestmanagement.controller;

import java.util.Scanner;

import com.capgemini.forestmanagement.bean.ClientBean;
import com.capgemini.forestmanagement.bean.SchedulerLogin;
import com.capgemini.forestmanagement.factory.Factory;
import com.capgemini.forestmanagement.services.AdminServices;

public class Admin {
	static AdminServices services1= Factory.objectAdminServices();
	public static void adminMain() {
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("****Admin Login*****");
			System.out.println("Enter Admin username and password");
			System.out.println("Admin username is admin and password is password");
			String user=sc.next();
			String pass=sc.next();
			if(user.equals("admin")&&pass.equals("password")) {
				while(true) {
					System.out.println("****ADMIN HOME*****");
					System.out.println(" 1.Accounts management\n 2.Product operations\n 3.Land operations\n 4.Home");
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
					switch (choice) {
					case 1:
						boolean val=true;
						while(val) {
							System.out.println("****ACCOUNT MANAGEMENT****");
							System.out.println(" 1.Client accounts\n 2.Scheduler accounts\n 3.Go back");
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
							Integer choice1 = Integer.parseInt(ch1);
							switch(choice1) {
							case 1:
								boolean val1=true;
								while(val1) {
									System.out.println("***CLIENT MANAGEMENT****");
									System.out.println(" 1.Create client account\n 2.Show client accounts\n 3.Remove client accounts\n "
											+ "4.Show client account\n 5.Go back");
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
									Integer choice2 = Integer.parseInt(ch2);
									switch(choice2) {
									case 1:
										ClientBean bean= new ClientBean();
										System.out.println("Enter client username");
										String username=null;
										char u = 'y';
										while(u=='y') {
											username= sc.next();

											if(Validations.isStringOnlyAlphabet(username)) {
												u='n';
											} else {
												System.err.println("enter only alphabets");
											}
										}
										bean.setUsername(username);
										System.out.println("Enter client password");
										bean.setPassword(sc.next());
										services1.addClient(bean);
										break;
									case 2:
										services1.showClients();
										break;
									case 3:
										System.out.println("Enter client username to remove");
										String username1=null;
										char u1 = 'y';
										while(u1=='y') {
											username1= sc.next();

											if(Validations.isStringOnlyAlphabet(username1)) {
												u1='n';
											} else {
												System.err.println("enter only alphabets");
											}
										}
										services1.removeclient(username1);
										break;
									case 4:
										System.out.println("Enter client username display ");
										String username2=null;
										char u2 = 'y';
										while(u2=='y') {
											username2= sc.next();

											if(Validations.isStringOnlyAlphabet(username2)) {
												u2='n';
											} else {
												System.err.println("enter only alphabets");
											}
										}
										services1.showClient(username2);
										break;
									case 5:
										val1=false;
										break;
									default:
										System.out.println("Enter valid option");
										break;
									} }
								break;
							case 2:
								boolean val2=true;
								while(val2) {
									System.out.println("***SCHEDULER MANAGEMENT****");
									System.out.println(" 1.Create Scheduler account\n 2.Show schdeuler accounts\n 3.Remove scheduler accounts\n"
											+ " 4.Show scheduler account\n 5.Go back");
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
									Integer choice3 = Integer.parseInt(ch3);
									switch(choice3) {
									case 1:
										SchedulerLogin bean= new SchedulerLogin();
										System.out.println("Enter scheduler username");
										String username=null;
										char u = 'y';
										while(u=='y') {
											username= sc.next();

											if(Validations.isStringOnlyAlphabet(username)) {
												u='n';
											} else {
												System.err.println("enter only alphabets");
											}
										}
										bean.setUsername(username);
										System.out.println("Enter scheduler password");
										bean.setPassword(sc.next());
										services1.addScheduler(bean);
										break;
									case 2:
										services1.showSchdeuler();
										break;
									case 3:
										System.out.println("Enter scheduler username to remove");
										String username1=null;
										char u1= 'y';
										while(u1=='y') {
											username1= sc.next();

											if(Validations.isStringOnlyAlphabet(username1)) {
												u1='n';
											} else {
												System.err.println("enter only alphabets");
											}
										}
										services1.removeSheduler(username1);
										break;
									case 4:
										System.out.println("Enter scheduler username to display");
										String username2=null;
										char u2 = 'y';
										while(u2=='y') {
											username2= sc.next();

											if(Validations.isStringOnlyAlphabet(username2)) {
												u2='n';
											} else {
												System.err.println("enter only alphabets");
											}
										}
										services1.showScheduler(username2);
										break;
									case 5:
										val2=false;
										break;
									default:
										System.out.println("Enter valid option");
										break;
									} }
								break;
							case 3:
								val=false;
								break;
							default:
								System.out.println("Enter valid option");
								break;
							}
						}
						break;
					case 2:
						Product.main();
						break;
					case 3:
						Land.main();
						break;
					case 4:
						String args[] = null;
						App.main(args);
						break;
					default:
						System.out.println("enter correct options");
						break;
					}
				}
			} else {
				System.out.println("enter valid credentials");
			}
		}
	}
}


