package com.cap.forestmanagementsystemjdbc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cap.forestmanagementsystemjdbc.bean.AdminBean;
import com.cap.forestmanagementsystemjdbc.bean.ClientBean;
import com.cap.forestmanagementsystemjdbc.bean.ProductBean;
import com.cap.forestmanagementsystemjdbc.factory.Factory;
import com.cap.forestmanagementsystemjdbc.services.AdminServices;
import com.cap.forestmanagementsystemjdbc.services.ClientServices;
import com.cap.forestmanagementsystemjdbc.services.ProductServices;

public class Admin {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		AdminServices services =Factory.adminServicesObject();
		ClientServices clientservices=Factory.clientServicesObject();
		ProductServices productservices=Factory.productServicesObject();
		AdminBean admin= new AdminBean();
		ClientBean client;
		while(true) {
			System.out.println("***WELCOME ADMIN***");
			System.out.println("------------------");
			System.out.println("Enter option to perform operation");
			System.out.println(" 1.Insert client\n 2.Remove client\n 3.Show client accounts\n 4.View all Contracts\n"
					+ " 5.Add Contract\n 6.view inventory\n 7.land details\n 8.Customer details\n 9.Home");
			System.out.print("Option:");
			int choice=sc.nextInt();
			System.out.println("---------------------");
			switch(choice) {
			case 1:
				
				System.out.print("Enter client username:");
				admin.setClientUserName(sc.next());
				System.out.print("Enter client password:");
				admin.setClientPassword(sc.next());
		
				if(services.addClient(admin)) {
					System.out.println("client account created");
				} else {
					System.out.println("client account not created");
				}
				break;
			case 2:
				System.out.println("enter client username to delete");
				String userName=sc.next();
				if(services.removeClient(userName)) {
					System.out.println("client account deleted");
				} else {
					System.out.println("client not found");
				}
				break;

			case 3:
				List<AdminBean> l1= services.showClients();
				for (AdminBean admin1 : l1) {
					System.out.println(admin1);
				}
				break;
			case 4:
				List<ClientBean> l2= new ArrayList<ClientBean>();
				l2=clientservices.showContracts();
				if(l2.size()!=0) {
				for (ClientBean clientBean : l2) {
					System.out.println(clientBean);
				}} else {
					System.out.println("no data");
				}
				break;
			case 5:
				System.out.println("Enter client username and password");
				String username=sc.next();
				String password=sc.next();
				if(clientservices.clientLogin(username, password))
				{
					System.out.println("logged in");
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
				System.out.println("enter delivery date");
				client.setDeliveryDay(sc.next());
				if(clientservices.addContract(client)) {
					System.out.println("contract added");
				} else {
					System.out.println("contract not added");
				}
					}
				else {
					System.out.println("enter correct login details");
				}
				
				break;
			case 6:
				List<ProductBean> l3= productservices.showProducts();
				for (ProductBean product : l3) {
					System.out.println(product);
				}
				break;
			case 7:
				Land.main(args);
				break;
			case 8:
				Customer.main(args);
			case 9:
				App.main(args);
				break;
			default:
				System.out.println("enter an option");
				break;
			}
		}
	}

}
