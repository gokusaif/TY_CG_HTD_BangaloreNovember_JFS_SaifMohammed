package com.cap.map.Treemap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap2 {
	public static void main(String[] args) {
		SortingAge a1=new SortingAge();
		TreeMap<Student,String> t1= new TreeMap<Student,String>(a1);
		t1.put(new Student(9,"john"),"3rd std");
		t1.put(new Student(5,"watson"),"1st std");
		t1.put(new Student(7,"tom"),"1st std");
		t1.put(new Student(8,"sherlock"),"2nd std");
	
	Set<Map.Entry<Student,String>> s1=t1.entrySet();
	for (Map.Entry<Student, String> e1 : s1) {
	
		System.out.println(e1.getKey());
		System.out.println(e1.getValue());
		System.out.println("--------");
	}
	System.out.println(t1.get(new Student(7,"tom")));
}}

