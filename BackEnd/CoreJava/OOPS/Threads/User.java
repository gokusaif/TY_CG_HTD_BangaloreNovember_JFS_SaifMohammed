package com.cap.thread;

public class User extends Thread {
	
	PVR r;

	public User(PVR r) {
		
		this.r = r;
	}

	
	public void run() {
		
		r.ticket();
	}
	
	
	
	

}
