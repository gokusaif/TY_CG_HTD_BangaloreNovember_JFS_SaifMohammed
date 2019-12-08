package com.tyss.access.package1;

public class Student {
	
	protected String name;
	
	protected Student(String name) {
		
		this.name=name;
	}
	
	
	protected void display()
	{
		System.out.println("name is"+name);
	}

}
