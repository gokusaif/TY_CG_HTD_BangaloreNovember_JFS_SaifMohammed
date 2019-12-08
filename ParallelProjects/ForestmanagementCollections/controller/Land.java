package com.cap.forestmanagement.controller;

import java.util.Scanner;

import com.cap.forestmanagement.bean.LandDetails;
import com.cap.forestmanagement.dao.DAOLand;
import com.cap.forestmanagement.factory.Factory;

public class Land {
	public static void main(String[] args) {
		DAOLand dao=Factory.objectDAOLand();
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("Welcome ");
			System.out.println("--------------");
			System.out.println("Select the option to perform operations");
			System.out.println("Option 1: Add land details");
			System.out.println("Option 2: Remove land details");
			System.out.println("option 3:display all details");
			System.out.println("Option 3: Home");
			int choice= sc.nextInt();
			switch(choice) {

			case 1:
				LandDetails l= new LandDetails();
				System.out.println("Add Details of land");
				System.out.println("-------------------");
				System.out.println("Enter land id");
				l.setLandId(sc.nextInt());
				System.out.println("Enter land location");
				l.setLandLocation(sc.next());
				System.out.println("Enter land value");
				l.setLandValue(sc.nextInt());
				System.out.println("Enter acquired date");
				l.setAcquiredDate(sc.next());
				dao.addDetails(l);

				break;
			case 2:
				System.out.println("---------");
				dao.displayDetails();
				break;
			case 3:
				App.main(args);
				break;
			}
		}



	}
}
