package com.tyss.access.package1;

public class Person {
	
	public static String name;
	
	public Person(String name){
		this.name=name;
	}
	
	public void details() {
	System.out.println("The name is"+name);	
	}
	
	public static void det()
	{
		System.out.println("name is"+name);
	}


}
