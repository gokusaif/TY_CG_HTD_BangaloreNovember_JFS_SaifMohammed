package com.cap.forestmanagementsystemjdbc.controller;

import java.util.List;
import java.util.Scanner;

import com.cap.forestmanagementsystemjdbc.bean.LandBean;
import com.cap.forestmanagementsystemjdbc.factory.Factory;
import com.cap.forestmanagementsystemjdbc.services.LandServices;


public class Land {
	public static void main(String[] args) {
		LandServices services= Factory.landServicesObject();
		Scanner sc= new Scanner(System.in);
		LandBean land=new LandBean();
		while(true) {
			System.out.println("Enter option to perform operation");
			System.out.println(" 1.Insert land details\n 2.Delete land details\n 3.Update land details\n "
					+ "4.View all land details\n 5.view land details\n 6.Home");
			int choice=sc.nextInt();

			switch(choice) {
			case 1:
				System.out.println("Enter land id");
				land.setLandId(sc.nextInt());
				System.out.println("Enter land location");
				land.setLandLocation(sc.next());
				System.out.println("Enter land value");
				land.setLandValue(sc.nextInt());
				System.out.println("Enter land date");
				land.setAcquiredDate(sc.next());
				if(services.addLandDetails(land)) {
					System.out.println("land details inserted");
				} else {
					System.out.println("land details not inserted");
				}
				break;
			case 2:
				System.out.println("enter land id to delete");
				int id=sc.nextInt();
				if(services.deleteLandDetails(id)) {
					System.out.println("land details deleted");
				} else {
					System.out.println("land details not found");
				}
				break;
			case 3:
				System.out.println("enter land id to update");
				int id1=sc.nextInt();
				System.out.println("enter land value to update");
				int value=sc.nextInt();
				if(services.updateLandDetails(id1,value)) {
					System.out.println("land value updated");
				} else {
					System.out.println("land details not found");
				}
				break;
			case 4:
				List<LandBean> l1= services.showLandDetails();
				if(l1.size()!=0) {
					for (LandBean land1 : l1) {
						System.out.println(land1);
					} }
				else {
					System.out.println("no data");
				}
				break;
			case 5:
				System.out.println("enter land id to display details");
				int id2=sc.nextInt();
				List<LandBean> l2= services.viewLandDetails(id2);
				if(l2.size()!=0) {
					for (LandBean land1 : l2) {
						System.out.println(land1);
					} }
				else {
					System.out.println("no data");
				}
				
				break;
			case 6:
				Admin.main(args);
				break;
			default:
				System.out.println("enter an option");
				break;
			}
		}
	}

}
