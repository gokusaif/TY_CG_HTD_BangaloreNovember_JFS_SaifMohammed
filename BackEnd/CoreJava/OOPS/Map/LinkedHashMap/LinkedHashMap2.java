package com.cap.map.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap2 {
	public static void main(String[] args) {
		LinkedHashMap<Integer,Employee> l1= new LinkedHashMap<Integer,Employee>();
		l1.put(45,new Employee(30000,"mary"));
		l1.put(23,new Employee(30000,"john"));
		l1.put(67,new Employee(30000,"sherlock"));
		l1.put(null,new Employee(30000,"tom"));
		
		System.out.println(l1.get(67));
		
		Set<Map.Entry<Integer,Employee>> s1=l1.entrySet();
		
		for (Map.Entry<Integer, Employee> e1 : s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("----");
		}
		System.out.println(l1.containsKey(45));
		System.out.println(l1.containsValue(new Employee(30000,"john")));
		System.out.println(l1.size());
		System.out.println(l1.isEmpty());
		
		
	}
}
