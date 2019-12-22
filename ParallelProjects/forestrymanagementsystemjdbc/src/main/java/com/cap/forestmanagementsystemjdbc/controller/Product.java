package com.cap.forestmanagementsystemjdbc.controller;

import java.util.List;
import java.util.Scanner;

import com.cap.forestmanagementsystemjdbc.bean.ProductBean;
import com.cap.forestmanagementsystemjdbc.factory.Factory;
import com.cap.forestmanagementsystemjdbc.services.ProductServices;

public class Product {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ProductServices services=Factory.productServicesObject();
		ProductBean prod=new ProductBean();
		while(true) {
			System.out.println("Enter option to perform operation");
			System.out.println(" 1.Insert product\n 2.Delete product\n 3.Update Product\n "
					+ "4.View all products\n 5.view product details\n 6.Home");
			int choice=sc.nextInt();

			switch(choice) {
			case 1:
				System.out.println("Enter product id");
				prod.setProductId(sc.nextInt());
				System.out.println("Enter name");
				prod.setProductName(sc.next());
				System.out.println("Enter quantity");
				prod.setProductQuantity(sc.next());

				if(services.insertProduct(prod)) {
					System.out.println("product inserted");
				} else {
					System.out.println("product not inserted");
				}
				break;
			case 2:
				System.out.println("enter product id to delete");
				int id=sc.nextInt();
				if(services.deleteProduct(id)) {
					System.out.println("product deleted");
				} else {
					System.out.println("product not found");
				}
				break;
			case 3:
				System.out.println("enter product id to update");
				int id1=sc.nextInt();
				System.out.println("enter quantity to update");
				String quantity=sc.next();
				if(services.updateProduct(id1,quantity)) {
					System.out.println("quantity updated");
				} else {
					System.out.println("product not found");
				}
				break;
			case 4:
				List<ProductBean> l1= services.showProducts();
				if(l1.size()!=0) {
				for (ProductBean product : l1) {
					System.out.println(product);
				}}
				else {
					System.out.println("no data");
				}
				break;
			case 5:
				System.out.println("enter product id to view details");
				int id2=sc.nextInt();
				List<ProductBean> l2= services.viewProducts(id2);
				if(l2.size()!=0) {
				for (ProductBean product : l2) {
					System.out.println(product);
				}}
				else {
					System.out.println("productid not found");
				}
				break;
			case 6:
				Client.main(args);
				break;
			default:
				System.out.println("enter an option");
				break;
			}
		}
	}

}
