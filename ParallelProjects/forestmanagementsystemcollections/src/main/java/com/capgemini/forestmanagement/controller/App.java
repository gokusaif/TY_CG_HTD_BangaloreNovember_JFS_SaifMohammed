
package com.capgemini.forestmanagement.controller;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("******FOREST MANAGEMENT SYSTEM*******");
			System.out.println("Select option for login");
			System.out.println("Option 1: Admin ");
			System.out.println("Option 2: Client ");
			System.out.println("Option 3: Scheduler ");
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
				Admin.adminMain();
				break;
			case 2:
				Client.main();
				break;
			case 3:
				Scheduler.main();
				break;
			default:
				System.out.println("enter correct option");
				break;


			}
		}

	}

}
