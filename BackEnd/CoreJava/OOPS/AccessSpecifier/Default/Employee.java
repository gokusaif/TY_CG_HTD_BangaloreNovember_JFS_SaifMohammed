package com.tyss.access.package1;

 public class Employee {
	
	 public String name;
	
	public Employee(String name) {
		
		this.name=name;
		System.out.println("constructor executed");
	}
	
	 public void display()
	{
		System.out.println("Name is "+name);
	}

}
