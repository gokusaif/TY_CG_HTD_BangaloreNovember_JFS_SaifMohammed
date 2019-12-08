package com.cap.forestmanagementsystemjdbc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cap.forestmanagementsystemjdbc.bean.ClientBean;
import com.cap.forestmanagementsystemjdbc.bean.CustomerBean;
import com.cap.forestmanagementsystemjdbc.factory.Factory;
import com.cap.forestmanagementsystemjdbc.services.ClientServices;

public class Client {
	public static void main(String[] args) {
		ClientServices services=Factory.clientServicesObject();
		ClientBean client;
		Scanner sc=new Scanner(System.in);
		System.out.println("**WELCOME CLIENT*");
		System.out.println("Enter your username and password");
		String username=sc.next();
		String password=sc.next();
		if(services.clientLogin(username, password))
		{
			System.out.println("logged in");
			while(true) {
				System.out.println("Enter the option to perform operations");
				System.out.println(" 1.enter contract details\n 2.delete contract\n 3.show all contracts\n"
						+ " 4.update contract\n 5.Inventory\n 6.view contract \n 7.Home");
				int choice1=sc.nextInt();
				switch(choice1) {
				case 1:
					client=new ClientBean();
					System.out.println("enter the contract details");
					System.out.println("enter contract id ");
					client.setContractId(sc.nextInt());
					System.out.println("enter product id");
					client.setProductId(sc.nextInt());
					System.out.println("enter haulier id");
					client.setHaulierId(sc.nextInt());
					System.out.println("Enter delivery date");
					client.setDeliveryDate(sc.next());
					System.out.println("enter delivery day");
					client.setDeliveryDay(sc.next());
					if(services.addContract(client)) {
						System.out.println("contract added");
					} else {
						System.out.println("contract not added");
					}
					break;
				case 2:
					System.out.println("enter contract id to delete");
					int id=sc.nextInt();
					if(services.deleteContract(id)) {
						System.out.println("contract deleted");
					} else {
						System.out.println("contract does not exist");
					}
					break;
				case 3:
					List<ClientBean> l1= new ArrayList<ClientBean>();
					l1=services.showContracts();
					if(l1.size()!=0) {
					for (ClientBean clientBean : l1) {
						System.out.println(clientBean);
					}}
					else {
						System.out.println("no data");
					}
					break;
				case 4:
					System.out.println("enter contract id to modify");
					int contractId=sc.nextInt();
					System.out.println("Enter detail to modify");
					System.out.println(" 1.product id\n 2.haulier id\n 3.delivery date\n 4.deliveryday");
					int choice=sc.nextInt();

					switch(choice) {
					case 1:
						System.out.println("enter new product id");
						int productid=sc.nextInt();
						if(services.updateProductId(contractId,productid)) {
							System.out.println("productid updated");
						} else {
							System.out.println("product id not updated");
						}
						break;
					case 2:
						System.out.println("enter new haulier id");
						int haulierid=sc.nextInt();
						if(services.updateHaulierId(contractId,haulierid)) {
							System.out.println("haulierid updated");
						} else {
							System.out.println("haulier id not updated");
						}
						break;
					case 3:
						System.out.println("enter new delivery date");
						String deliveryDate=sc.next();
						if(services.updateDeliveryDate(contractId, deliveryDate)) {
							System.out.println("delivery date updated");
						} else {
							System.out.println("delivery date not updated");
						}
						break;
					case 4:
						System.out.println("enter new delivery date");
						String deliveryDay=sc.next();
						if(services.updateDeliveryDay(contractId, deliveryDay)) {
							System.out.println("delivery day updated");
						} else {
							System.out.println("delivery day not updated");
						}
						break;
					default:
						System.out.println("enter option");
						break;
					}
					break;
				case 5:
					Product.main(args);
					break;
				case 6:
					List<ClientBean> l3= new ArrayList<ClientBean>();
					System.out.println("enter customer id to display details");
					int id2=sc.nextInt();
					l3=services.viewContracts(id2);
					if(l3.size()!=0) {
						for (ClientBean cust2 : l3) {
							System.out.println(cust2);
						}}
					else {
						System.out.println("contract not found");
					}
					break;
				case 7:
					App.main(args);
					break;
				default:
					System.out.println("enter option");
					break;

				}
			}

		}
		else {
			System.out.println("enter correct login details");
		}


	}

}
