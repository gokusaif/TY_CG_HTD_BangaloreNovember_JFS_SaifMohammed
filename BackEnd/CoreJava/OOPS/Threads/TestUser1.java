package com.cap.thread;

public class TestUser1 {
	public static void main(String[] args) {
		System.out.println("started");
		IRCTC i1= new IRCTC();
		User1 u1= new User1(i1);
		User1 u2= new User1(i1);
		u1.start();
		u2.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		
			e.printStackTrace();
		}
		i1.leaveMe();
		System.out.println("ended");
		
	}

}
