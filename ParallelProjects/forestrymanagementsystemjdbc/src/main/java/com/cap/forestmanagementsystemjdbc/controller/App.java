package com.cap.forestmanagementsystemjdbc.controller;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("***WELCOME TO FOREST MANAGEMENT SYSTEM***");
			System.out.println("----Select option----");
			System.out.println("1:Admin operations");
			System.out.println("2:Client login");
			System.out.println("3.Scheduler operations");
			System.out.println("--------------------");
			System.out.print("Option:");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				Admin.main(args);
				break;
			case 2:
				Client.main(args);
				break;
			case 3:
				Scheduler.main(args);
			default:
				System.out.println("Please enter a choice");
				break;
			}
		}
	}

}
