package com.tyss.access.package2;

import com.tyss.access.package1.Student;

public class TestStudent extends Student {
	
	
	 protected TestStudent(String name){
		 
		 super(name);
	 }
	
	public static void main(String[] args) {
		TestStudent s1= new TestStudent("saif");
		s1.display();
		
		

	}
	
	
} 
