
package com.cap.forestmanagement.controller;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("****Home*****");
		System.out.println("select option for operations");
		System.out.println("Option 1: client operations");
		System.out.println("Option 2: customer operations");
		System.out.println("Option 3: land operations");

		int choice=sc.nextInt();
		switch(choice) {
		
		case 1:
			Client.main(args);
			break;
		case 2:
			Customer.main(args);
			break;
		case 3:
			Land.main(args);
			break;
		default:
		break;

		
		}
		
	}

}
