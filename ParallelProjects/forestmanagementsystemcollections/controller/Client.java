package com.capgemini.forestmanagement.controller;


import java.util.Scanner;

import com.capgemini.forestmanagement.bean.ClientBean;
import com.capgemini.forestmanagement.bean.ContractDetails;
import com.capgemini.forestmanagement.factory.Factory;
import com.capgemini.forestmanagement.services.ClientServices;

public class Client extends Admin {
	static	ClientServices services =Factory.objectServices();
	public static void main() {
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("*******Welcome client*********");
			System.out.println("Enter username");
			String user=sc.next();
			System.out.println("enter password");
			String pass=sc.next();
			if(services1.checkClient(user, pass)) {
				while(true) {
					System.out.println("--------------");
					System.out.println("Select the option to perform operations");
					System.out.println("Option 1:Change password");
					System.out.println("Option 2: Add contract");
					System.out.println("Option 3: Remove contract");
					System.out.println("Option 4: show all contracts");
					System.out.println("option 5: modify contract");
					System.out.println("Option 6: Show contract");
					System.out.println("Option 7: Customer operations");
					System.out.println("Option 8: Home");
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
						ClientBean bean= new ClientBean();
						bean.setUsername(user);
						bean.setPassword(password);
						services1.updateClient(bean);
						break;
					case 2:
						ContractDetails con = new ContractDetails();
						System.out.println("Add Contract Details of contract");
						System.out.println("-------------------");
						System.out.println("Enter contract id");
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
						con.setContractNo(id);
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
						Integer id1 = Integer.parseInt(ch2);
						con.setCustomerId(id1);
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
						con.setProductId(id2);
						System.out.println("Enter quantity");
						String quantity=null;
						char q1 = 'y';
						while(q1=='y') {
							quantity= sc.next();
							if(Validations.isNumber(quantity)) {
								q1='n';
							} else {
								System.err.println("enter numbers only");
							}
						} 
						con.setQuantity(Integer.parseInt(quantity));
						System.out.println("Enter delivery date in dd/mm/yyyy format");
						String date=null;
						char d = 'y';
						while(d=='y') {
							date= sc.next();
							if(Validations.isValidDate(date)) {
								System.err.println("enter valid date in dd/mm/yyyy format only");
							} else {
								d='n';
							}
						} 
						con.setDeliveryDate(date);
						services.contractDetails(con);		

						break;
					case 3:
						System.out.println("Enter contract id to remove contract ");
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
						services.removeContract(id4);
						break;
					case 4:
						System.out.println("---------");
						services.showAll();
						break;
					case 5:
						System.out.println("enter contract id to modify details");
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
						ContractDetails conn = services.getContract(id5);
						if(conn!=null) {
							String brk = "yes";
							while(brk.equals("yes")) {
								System.out.println("modify details of customer");
								System.out.println("enter which detail to modify");
								System.out.println(" 1.Product id\n 2.Quantity\n 3.Delivery Date");
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
								Integer mod = Integer.parseInt(ch7);
								switch(mod) {
								case 1:
									System.out.println("enter new product id");
									String ch8=null;
									char c8 = 'y';
									while(c8=='y') {
										ch8= sc.next();
										if(Validations.isNumber(ch8)) {
											c8='n';
										} else {
											System.err.println("enter numbers only");
										}
									} 
									Integer id7 = Integer.parseInt(ch8);
									conn.setProductId(id7);
									System.out.println("details updated");
									System.out.println("Do you want to modify other details?");
									System.out.println("Type yes to continue or any key to exit");
									brk=sc.next();
									break;
								case 2:
									System.out.println("enter new quantity to update");
									String quantity1=null;
									char q2 = 'y';
									while(q2=='y') {
										quantity1= sc.next();
										if(Validations.isNumber(quantity1)) {
											q2='n';
										} else {
											System.err.println("enter numbers only");
										}
									} 
									conn.setQuantity(Integer.parseInt(quantity1));
									System.out.println("details updated");
									System.out.println("Do you want to modify other details?");
									System.out.println("Type yes to continue or any key to exit");
									brk=sc.next();
									break;
								case 3:
									System.out.println("enter new delivery date");
									System.out.println("Enter delivery date in dd/mm/yyyy format");
									String date1=null;
									char d1 = 'y';
									while(d1=='y') {
										date1= sc.next();
										if(Validations.isValidDate(date1)) {
											System.err.println("enter valid date in dd/mm/yyyy format only");
										} else {
											d1='n';
										}
									} 
									conn.setDeliveryDate(date1);
									System.out.println("details updated");
									System.out.println("Do you want to modify other details?");
									System.out.println("Type yes to continue or any key to exit");
									brk=sc.next();
									break;
								default:
									System.out.println("enter proper option");
									break;
								}
							}
						} else {
							System.out.println("details not found");
						}
						break;
					case 6:
						System.out.println("Enter contract id to display details");
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
						ContractDetails bean1=services.getContract(Integer.parseInt(search));
						if(bean1!=null) {
							System.out.println(bean1);
						} else {
							System.out.println("Contract not found");
						}
						break;
					case 7:
						Customer.main();
						break;
					case 8:
						String args[]=null;
						App.main(args);
						break;
					default:
						System.out.println("enter correct option");
						break;
					}

				}} else {
					System.out.println("enter valid credentials");
					System.out.println("Dont have an account? type yes to ask admin to create account type anything to try again");
					String reply=sc.next();
					if(reply.equals("yes")) {
						Admin.adminMain();
					}
				}
		}
	}

}
