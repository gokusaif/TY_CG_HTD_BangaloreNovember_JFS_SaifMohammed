package com.cap.forestmanagement.controller;

import java.util.Scanner;

import com.cap.forestmanagement.bean.LandDetails;
import com.cap.forestmanagement.bean.ProductDetails;
import com.cap.forestmanagement.factory.Factory;
import com.cap.forestmanagement.services.ProductServices;

public class Product {
	public static void main(String[] args) {
		ProductServices services= Factory.objectProductServices();
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("Welcome ");
			System.out.println("--------------");
			System.out.println("Select the option to perform operations");
			System.out.println("Option 1: Add product details");
			System.out.println("Option 2: Remove product details");
			System.out.println("option 3:display all details");
			System.out.println("Option 4: Home");
			int choice= sc.nextInt();
			switch(choice) {

			case 1:
				ProductDetails l=new ProductDetails();
				System.out.println("Add Details of product");
				System.out.println("-------------------");
				System.out.println("Enter product id");
				Integer id=sc.nextInt();
				l.setProductId(id);
				System.out.println("Enter product name");
				l.setProductName(sc.next());
				System.out.println("Enter product quantity");
				l.setProductQuantity(sc.next());
				services.addDetails(id,l);

				break;
			case 2:
				System.out.println("Enter product id to remove details ");
				Integer Id1=sc.nextInt();
				services.removeContract(Id1);
				break;
			case 3:
				System.out.println("---------");
				services.displayDetails();
				break;
			case 4:
				App.main(args);
				break;
			}
		}
	}

}
