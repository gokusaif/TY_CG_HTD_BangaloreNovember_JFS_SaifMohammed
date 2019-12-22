package com.cap.forestmanagement.controller;


import java.util.Scanner;

import com.cap.forestmanagement.bean.ContractDetails;

import com.cap.forestmanagement.factory.Factory;
import com.cap.forestmanagement.services.ClientServices;

public class Client {
	static	ClientServices services =Factory.objectServices();
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("Welcome client ");
			System.out.println("--------------");
			System.out.println("Select the option to perform operations");
			System.out.println("Option 1: Add contract");
			System.out.println("Option 2: Remove contract");
			System.out.println("Option 3: show all contracts");
			System.out.println("option 4: modify contract");
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
				ContractDetails con = new ContractDetails();
				System.out.println("Add Contract Details of contract");
				System.out.println("-------------------");
				System.out.println("Enter contract id");
				con.setContractNo(sc.nextInt());
				System.out.println("Enter customer id");
				con.setCustomerId(sc.nextInt());
				System.out.println("Enter product id");
				con.setProductId(sc.nextInt());
				System.out.println("Enter haulier id");
				con.setHaulierId(sc.nextInt());
				System.out.println("Enter quantity");
				con.setQuantity(sc.nextInt());
				System.out.println("Enter delivery date");
				con.setDeliveryDate(sc.next());
				System.out.println("Enter delivery day");
				con.setDeliveryDay(sc.next());

				services.contractDetails(con);		

				break;
			case 2:
				System.out.println("Enter contract id to remove contract ");
				Integer productId1=sc.nextInt();
				services.removeContract(productId1);
				break;
			case 3:
				System.out.println("---------");
				services.showAll();
				break;
			case 4:
				System.out.println("enter contract id to modify details");
				Integer contractId=sc.nextInt();
				ContractDetails conn = services.getContract(contractId);
				if(conn!=null) {
					String brk = "yes";
					while(brk.equals("yes")) {
						System.out.println("modify details of customer");
						System.out.println("enter which detail to modify");
						System.out.println("1.Product id\n 2.Haulier id\n 3.Quantity\n 4.Delivery Date\n 5.Delivery Day");
						int mod= sc.nextInt();
						switch(mod) {
						case 1:
							System.out.println("enter new product id");
							conn.setProductId(sc.nextInt());
							System.out.println("details updated");
							System.out.println("Do you want to modify other details?");
							System.out.println("Type yes to continue or any key to exit");
							brk=sc.next();
							break;
						case 2:
							System.out.println("enter new haulier id");
							conn.setHaulierId(sc.nextInt());
							System.out.println("details updated");
							System.out.println("Do you want to modify other details?");
							System.out.println("Type yes to continue or any key to exit");
							brk=sc.next();
							break;
						case 3:
							System.out.println("enter new product id");
							conn.setQuantity(sc.nextInt());
							System.out.println("details updated");
							System.out.println("Do you want to modify other details?");
							System.out.println("Type yes to continue or any key to exit");
							brk=sc.next();
							break;
						case 4:
							System.out.println("enter new delivery day");
							conn.setDeliveryDate(sc.next());
							System.out.println("details updated");
							System.out.println("Do you want to modify other details?");
							System.out.println("Type yes to continue or any key to exit");
							brk=sc.next();
							break;
						case 5:
							System.out.println("enter new delivery day");
							conn.setDeliveryDay(sc.next());
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

			case 5:
				App.main(args);
				break;
			default:
				System.out.println("enter correct option");
				break;
			}

		}
	}

}
