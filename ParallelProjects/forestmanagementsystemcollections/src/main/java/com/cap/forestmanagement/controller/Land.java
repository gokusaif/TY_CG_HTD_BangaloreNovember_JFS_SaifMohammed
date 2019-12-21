package com.cap.forestmanagement.controller;

import java.util.Scanner;

import com.cap.forestmanagement.bean.LandDetails;
import com.cap.forestmanagement.dao.DAOLand;
import com.cap.forestmanagement.factory.Factory;
import com.cap.forestmanagement.services.LandServices;

public class Land {
	static LandServices services=Factory.objectLandServices();
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("Welcome ");
			System.out.println("--------------");
			System.out.println("Select the option to perform operations");
			System.out.println("Option 1: Add land details");
			System.out.println("Option 2: Remove land details");
			System.out.println("option 3:modify land details");
			System.out.println("option 4:display all details");
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
				services.addDetails(l);

				break;
			case 2:
				System.out.println("Enter land id to remove details ");
				Integer Id1=sc.nextInt();
				services.removeContract(Id1);
				break;
			case 3:
				System.out.println("enter land id to modify details");
				int id=sc.nextInt();
				LandDetails det= services.getLandDetails(id);
				if(det!=null) {
					System.out.println("Enter land value to update");
					det.setLandValue(sc.nextInt());
					services.modifyContract(det);
					System.out.println("details updated");
				}
				else {
					System.out.println("land id not found");
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
