package com.cap.forestmanagementsystemjdbc.bean;

import java.util.List;
import java.util.Scanner;

import com.cap.forestmanagementsystemjdbc.controller.App;
import com.cap.forestmanagementsystemjdbc.factory.Factory;
import com.cap.forestmanagementsystemjdbc.services.SchedulerServices;

public class Scheduler {
	public static void main(String[] args) {
		SchedulerServices services= Factory.schedulerServicesObject();
		Scanner sc= new Scanner(System.in);
		SchedulerBean scheduler=new SchedulerBean();
		while(true) {
			System.out.println("Enter option to perform operation");
			System.out.println(" 1.Insert schedule\n 2.Delete schedule\n 3.Update schedule details\n "
					+ "4.View all schedules\n 5.Home");
			int choice=sc.nextInt();

			switch(choice) {
			case 1:
				System.out.println("Enter schedule id");
				scheduler.setSchedulerId(sc.nextInt());
				System.out.println("Enter transport type");
				scheduler.setTransport(sc.next());
				System.out.println("Enter date");
				scheduler.setDate(sc.next());
				System.out.println("Enter product id");
				scheduler.setProductId(sc.nextInt());
				System.out.println("Enter quantity");
				scheduler.setQuantity(sc.next());
				if(services.insertSchedule(scheduler)) {
					System.out.println("schedule details inserted");
				} else {
					System.out.println("schedule details not inserted");
				}
				break;
			case 2:
				System.out.println("enter schedule id to delete");
				int id=sc.nextInt();
				if(services.deleteSchedule(id)) {
					System.out.println("schedule details deleted");
				} else {
					System.out.println("schedule details not found");
				}
				break;
			case 3:
				System.out.println("select detail to update\n 1.quantity\n 2.date");
				int choice1=sc.nextInt();
				switch(choice1) {
				case 1:
					System.out.println("enter schedule id to update");
					int id1=sc.nextInt();
					System.out.println("enter quantity to update");
					String value=sc.next();
					if(services.updateSchedule(id1, value)) {
						System.out.println("schedule updated");
					} else {
						System.out.println("schedule details not found");
					} 
					break;
				case 2:
					System.out.println("enter schedule id to update");
					int id2=sc.nextInt();
					System.out.println("enter date to update");
					String value1=sc.next();
					if(services.updateSchedule(id2, value1)) {
						System.out.println("schedule updated");
					} else {
						System.out.println("schedule details not found");
					} 
					break;
				default:
					System.out.println("enter option");
					break;
				}
				break;
			case 4:
				List<SchedulerBean> l1= services.showSchedules();
				if(l1.size()!=0) {
					for (SchedulerBean sch1 : l1) {
						System.out.println(sch1);
					} }
				else {
					System.out.println("no data");
				}
				break;
			case 5:
				App.main(args);
				break;
			default:
				System.out.println("enter an option");
				break;
			}
		}
	}

}
