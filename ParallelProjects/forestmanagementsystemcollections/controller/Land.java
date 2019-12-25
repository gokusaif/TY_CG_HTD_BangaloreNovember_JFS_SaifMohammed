package com.capgemini.forestmanagement.controller;

import java.util.Scanner;

import com.capgemini.forestmanagement.bean.LandDetails;
import com.capgemini.forestmanagement.factory.Factory;
import com.capgemini.forestmanagement.services.LandServices;

public class Land {
	static LandServices services=Factory.objectLandServices();
	public static void main() {
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("****LAND OPERATIONS****");
			System.out.println("--------------");
			System.out.println("Select the option to perform operations");
			System.out.println("Option 1: Add land details");
			System.out.println("Option 2: Remove land details");
			System.out.println("option 3: modify land details");
			System.out.println("option 4: display all land details");
			System.out.println("option 5: Display land details");
			System.out.println("Option 6: Home");
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
				String ch1=null;
				char c1 = 'y';
				while(c1=='y') {
					ch1= sc.next();
					if(Validations.isNumber(ch1)) {
						c1='n';
					} else {
						System.err.println("enter numbers only");
					}
				} 
				Integer id1 = Integer.parseInt(ch1);
				l.setLandId(id1);
				System.out.println("Enter land location");
				String ch2=null;
				char c2 = 'y';
				while(c2=='y') {
					ch2= sc.next();
					if(Validations.isStringOnlyAlphabet(ch2)) {
						c2='n';
					} else {
						System.err.println("enter alphabets only");
					}
				} 
				l.setLandLocation(ch2);
				System.out.println("Enter land value");
				String ch3=null;
				char c3 = 'y';
				while(c3=='y') {
					ch3= sc.next();
					if(Validations.isNumber(ch3)) {
						c3='n';
					} else {
						System.err.println("enter numbers only");
					}
				} 
				Integer value = Integer.parseInt(ch3);
				l.setLandValue(value);
				System.out.println("Enter acquired date in dd/mm/yyyy format");
				String date=null;
				char d = 'y';
				while(d=='y') {
					date= sc.next();
					if(Validations.isValidDateFormat(date)) {
						d='n';
					} else {
						System.err.println("enter date in dd/mm/yyyy format only");
					}
				} 
				l.setAcquiredDate(date);
				services.addDetails(l);

				break;
			case 2:
				System.out.println("Enter land id to remove details ");
				String ch6=null;
				char c6 = 'y';
				while(c6=='y') {
					ch6= sc.next();
					if(Validations.isNumber(ch6)) {
						c6='n';
					} else {
						System.err.println("enter numbers only");
					}
				} 
				Integer Id1 = Integer.parseInt(ch6);
				services.removeContract(Id1);
				break;
			case 3:
				System.out.println("enter land id to modify details");
				String ch4=null;
				char c4= 'y';
				while(c4=='y') {
					ch4= sc.next();
					if(Validations.isNumber(ch4)) {
						c4='n';
					} else {
						System.err.println("enter numbers only");
					}
				} 
				Integer Id2 = Integer.parseInt(ch4);
				LandDetails det= services.getLandDetails(Id2);
				if(det!=null) {
					System.out.println("Enter land value to update");
					String ch5=null;
					char c5 = 'y';
					while(c5=='y') {
						ch5= sc.next();
						if(Validations.isNumber(ch5)) {
							c5='n';
						} else {
							System.err.println("enter numbers only");
						}
					} 
					Integer value1 = Integer.parseInt(ch5);
					det.setLandValue(value1);
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
				System.out.println("Enter land id to display details");
				String search=null;
				char c5 = 'y';
				while(c5=='y') {
					search= sc.next();
					if(Validations.isNumber(search)) {
						c5='n';
					} else {
						System.err.println("enter numbers only");
					}
				} 
				LandDetails bean=services.getLandDetails(Integer.parseInt(search));
				if(bean!=null) {
					System.out.println(bean);
				} else {
					System.out.println("Land details not found");
				}
				break;
			case 6:
				Admin.adminMain();
				break;
			default:
				System.out.println("enter correct option");
				break;
			}
		}



	}
}
