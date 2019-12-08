package com.cap.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap2 {
	public static void main(String[] args) {
		HashMap<Integer,Student> h1= new HashMap<Integer,Student>();
		h1.put(2,new Student(22,"john"));
		h1.put(3,new Student(23,"watson"));
		h1.put(3,new Student(29,"watson1"));
		h1.put(null,null);
		h1.put(7,new Student(24,"null"));
		h1.put(null,new Student(1,"sherlock"));
		h1.put(8,null);
		h1.put(10,null);
		
		Collection<Student> c1=h1.values(); 
		System.out.println("values");
		for (Student student : c1) {
			System.out.println(student);
			System.out.println("-------");
		}
		Collection<Integer> c2=h1.keySet(); 
		System.out.println("keys");
		for (Integer student2 : c2) {
			System.out.println(student2);
			System.out.println("-------");
		}
		
	    Set<Map.Entry<Integer,Student>> s1=h1.entrySet();
	    for (Map.Entry<Integer, Student> e1 : s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("------");
		}
	    System.out.println(h1.containsKey(7));
	    System.out.println(h1.containsValue(new Student(22,"john")));
	    
	    System.out.println(h1.size());
	    System.out.println(h1.isEmpty());
	}

}
