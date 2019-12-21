package com.cap.forestmanagement.controller;

import java.util.Scanner;

import com.cap.forestmanagement.bean.LandDetails;
import com.cap.forestmanagement.bean.ProductDetails;
import com.cap.forestmanagement.factory.Factory;
import com.cap.forestmanagement.services.ProductServices;

public class Product {
	static	ProductServices services= Factory.objectProductServices();
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("Welcome ");
			System.out.println("--------------");
			System.out.println("Select the option to perform operations");
			System.out.println("Option 1: Add product details");
			System.out.println("Option 2: Remove product details");
			System.out.println("Option 3:Modify product details");
			System.out.println("option 4:display all details");
			System.out.println("Option 5: Home");
			String ch=null;
			char c = 'y';
			while(c=='y') {
				ch= sc.next();
				if(Validations.isNumber(ch)) {
					c='n';
				} else {
					System.err.println("enter only numbers");
				}
			} 
			Integer choice = Integer.parseInt(ch);
			switch(choice) {

			case 1:
				ProductDetails l=new ProductDetails();
				System.out.println("Add Details of product");
				System.out.println("-------------------");
				String id=null;
				char c1='y';
				while(c1=='y') {
					System.out.println("Enter product id");
					id= sc.next();
					if(Validations.isNumber(id)) {
						c1='n';
					} else {
						System.err.println("enter only numbers\n");
					}
				} 
				l.setProductId(Integer.parseInt(id));
				System.out.println("Enter product name");
				l.setProductName(sc.next());
				System.out.println("Enter product quantity");
				l.setProductQuantity(sc.next());
				services.addDetails(l);
				break;
			case 2:
				System.out.println("Enter product id to remove details ");
				String id1=null;
				char c2='y';
				while(c2=='y') {
					System.out.println("Enter product id");
					id1= sc.next();
					if(Validations.isNumber(id1)) {
						c2='n';
					} else {
						System.err.println("enter only numbers\n");
					}
				} 
				Integer Id1= Integer.parseInt(id1);
				services.removeContract(Id1);
				break;
			case 3:
				System.out.println("Enter product id to modify details");
				String id2=null;
				char c3='y';
				while(c3=='y') {
					System.out.println("Enter product id");
					id2= sc.next();
					if(Validations.isNumber(id2)) {
						c3='n';
					} else {
						System.err.println("enter only numbers\n");
					}
				} 
				Integer Id2= Integer.parseInt(id2);
				ProductDetails prod= services.getDetails(Id2);
				if(prod!=null) {
					System.out.println("enter quantity to update");
					prod.setProductQuantity(sc.next());
					services.modifyDetails(prod);

				} else {
					System.out.println("product id not found");
				}
				break;
			case 4:
				System.out.println("---------");
				services.displayDetails();
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
