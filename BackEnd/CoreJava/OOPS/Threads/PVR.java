package com.cap.thread;

public class PVR {
	
	synchronized void ticket() {
		for(int i=0;i<6;i++) {
			System.out.println(i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				
//				e.printStackTrace();
//			}
			try {
				wait();
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
	}
	
	synchronized void leaveMe() {
		notify();
		System.out.println("notify called");
	}
	

}
