package com.cap.forestmanagement.controller;


import java.util.Scanner;


import com.cap.forestmanagement.dao.DAO;
import com.cap.forestmanagement.factory.Factory;
import com.cap.forestmanagement.services.ClientServices;

public class Client {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ClientServices services =Factory.objectServices();
		while(true) {
			System.out.println("Welcome client ");
			System.out.println("--------------");
			System.out.println("Select the option to perform operations");
			System.out.println("Option 1: Add contract");
			System.out.println("Option 2: Remove contract");
			System.out.println("Option 3: show all contracts");
			System.out.println("option 4: modify contract");
			System.out.println("Option 5: Home");
			int choice= sc.nextInt();
			switch(choice) {

			case 1:
				System.out.println("Add Contract Details of contract");
				System.out.println("-------------------");
				System.out.println("Enter delivery date");
				String deliveryDate=sc.next();
				System.out.println("Enter delivery day");
				String deliveryDay=sc.next();
				System.out.println("Enter contract id");
				int contractNo=sc.nextInt();
				System.out.println("Enter customer id");
				int customerId=sc.nextInt();
				System.out.println("Enter product id");
				Integer productId=sc.nextInt();
				System.out.println("Enter haulier id");
				int haulierId=sc.nextInt();
				System.out.println("Enter quantity");
				int quantity=sc.nextInt();

				services.contractDetails(productId, contractNo, customerId, haulierId, deliveryDate, deliveryDay, quantity);		

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
				System.out.println("enter contract id to modify contract details");
				Integer productid2=sc.nextInt();
				if(services.modifyContract(productid2)) {
					System.out.println("Add Contract Details of contract");
					System.out.println("-------------------");
					System.out.println("Enter delivery date");
					String deliveryDate1=sc.next();
					System.out.println("Enter delivery day");
					String deliveryDay1=sc.next();
					System.out.println("Enter contract id");
					int contractNo1=sc.nextInt();
					System.out.println("Enter customer id");
					int customerId1=sc.nextInt();
					System.out.println("Enter haulier id");
					int haulierId1=sc.nextInt();
					System.out.println("Enter quantity");
					int quantity1=sc.nextInt();

					services.contractDetails(productid2, contractNo1, customerId1, haulierId1, deliveryDate1, 
							deliveryDay1, quantity1);	 }
				else {
					System.out.println("contract not found");
				}
				break;

			case 5:
				App.main(args);
				break;
			}

		}
	}

}
