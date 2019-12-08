package com.cap.map.Treemap;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMap3 {

	public static void main(String[] args) {
		ArrayList<Person> a1= new ArrayList<Person>();
		a1.add(new Person(6,"john"));
		a1.add(new Person(7,"watson"));

		ArrayList<Person> a2= new ArrayList<Person>();
		a2.add(new Person(8,"mary"));
		a2.add(new Person(9,"sherlock"));

		ArrayList<Person> a3= new ArrayList<Person>();
		a3.add(new Person(10,"tom"));
		a3.add(new Person(11,"sam"));

		TreeMap<String,ArrayList<Person>> t1= new TreeMap<String,ArrayList<Person>>();
		t1.put("1st std",a1);
		t1.put("2nd std",a2);
		t1.put("3rd std",a3);
		System.out.println(t1.get("1st std"));
		
		Set<Map.Entry<String,ArrayList<Person>>> s1=t1.entrySet();
		for (Map.Entry<String,ArrayList<Person>> e1 : s1) {
			
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("--------");
		}
		

	}
}
