package com.cap.forestmanagementsystemjdbc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cap.forestmanagementsystemjdbc.bean.CustomerBean;
import com.cap.forestmanagementsystemjdbc.factory.Factory;
import com.cap.forestmanagementsystemjdbc.services.CustomerServices;

public class Customer {
	public static void main(String[] args) {
		CustomerServices services= Factory.customerServicesObject();
		Scanner sc=new Scanner(System.in);
		CustomerBean cust;
		while(true) {
			System.out.println("Enter the option to perform operations");
			System.out.println(" 1.enter customer details\n 2.delete customer details\n "
					+ "3.show all customer details\n"
					+ " 4.update customer details\n 5.Home");
			int choice1=sc.nextInt();
			switch(choice1) {
			case 1:
				cust=new CustomerBean();
				System.out.println("enter the customer details");
				System.out.println("enter customer id ");
				cust.setCustomerid(sc.nextInt());
				System.out.println("enter customer name ");
				cust.setCustomerName(sc.next());
				System.out.println("enter customer address ");
				cust.setCustomerAddress(sc.next());
				System.out.println("enter customer town ");
				cust.setCustomerTown(sc.next());
				System.out.println("enter customer zipcode ");
				cust.setCustomerZip(sc.nextInt());
				System.out.println("enter customer email ");
				cust.setCustomerEmail(sc.next());
				System.out.println("enter customer phone ");
				cust.setCustomerPhone(sc.nextInt());
				if(services.addCustomer(cust)) {
					System.out.println("customer details added");
				} else {
					System.out.println("customer details not added");
				}
				break;
			case 2:
				System.out.println("enter customer id to delete");
				int id=sc.nextInt();
				if(services.deleteCustomer(id)) {
					System.out.println("customer details deleted");
				} else {
					System.out.println("customer details does not exist");
				}
				break;
			case 3:
				List<CustomerBean> l1= new ArrayList<CustomerBean>();
				l1=services.showCustomers();
				if(l1.size()!=0) {
					for (CustomerBean cust2 : l1) {
						System.out.println(cust2);
					}}
				else {
					System.out.println("no data");
				}
				break;
			case 4:
				System.out.println("Enter detail to modify");
				System.out.println(" 1.Address \n 2.Contact details");
				int choice=sc.nextInt();

				switch(choice) {
				case 1:
					cust=new CustomerBean();
					System.out.println("enter customer id to modify");
					cust.setCustomerid(sc.nextInt());
					System.out.println("enter new address");
					cust.setCustomerAddress(sc.next());
					System.out.println("enter town");
					cust.setCustomerTown(sc.next());
					System.out.println("enter new zipcode");
					cust.setCustomerZip(sc.nextInt());
					if(services.updateAddress(cust)) {
						System.out.println("address updated");
					} else {
						System.out.println("address not updated");
					}
					break;
				case 2:
					cust=new CustomerBean();
					System.out.println("enter customer id to modify");
					cust.setCustomerid(sc.nextInt());
					System.out.println("enter new email");
					cust.setCustomerEmail(sc.next());
					System.out.println("enter new phone no");
					cust.setCustomerPhone(sc.nextInt());
					if(services.updateContact(cust)) {
						System.out.println("contact details updated");
					} else {
						System.out.println("contact details not updated");
					}
				default:
					System.out.println("enter option");
					break;
				}
				break;

			case 5:
				Admin.main(args);
				break;
			default:
				System.out.println("enter option");
				break;

			}
		}


	}
}

