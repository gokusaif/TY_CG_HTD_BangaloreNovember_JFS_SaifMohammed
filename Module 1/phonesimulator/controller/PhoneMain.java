package com.cap.phonesimulator.controller;

import java.util.List;
import java.util.Scanner;

import com.cap.phonesimulator.dao.CRUDDao;
import com.cap.phonesimulator.dto.Contact;
import com.cap.phonesimulator.factory.Factory;

public class PhoneMain {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		CRUDDao dao= Factory.objectCRUDDaoImpl();
		while(true) {
			System.out.println("**WELCOME USER**");
			System.out.println("select options for functions");
			System.out.println(" 1.view all contacts\n 2.search contact\n 3.contact operations");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				List<Contact> l1= dao.viewAllContacts();
				if(l1!=null) {
					for (Contact contact : l1) {
						System.out.println(contact);
					}
				} else {
					System.out.println("no data");
				}
				break;
			case 2:
				System.out.println("enter name to call or text");
				String name=sc.next();
				Contact con=dao.viewContact(name);
				if(con!=null) {
					System.out.println(" number is "+con.getNumber());
					System.out.println(" group name is "+con.getGroupname());
					System.out.println(" 1.call\n 2.text\n 3.go back");
					int choice1=sc.nextInt();
					switch(choice1) {
					case 1:
						System.out.println("call in progress press any key to end call");
						sc.next();
						break;
					case 2:
						System.out.println("enter msg to send");
						sc.next();
						System.out.println("msg sent");
						break;
					case 3:
						PhoneMain.main(args);
						break;
					default:
						System.out.println("enter valid option");
						break;
					}
				} else {
					System.out.println("contact not found");
				}
				break;
			case 3:
				CRUDContact.main(args);
				break;
			default:
				System.out.println("enter valid option");
				break;
			}
		}
	}

}
