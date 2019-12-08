package com.cap.map.Treemap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		TreeMap<Integer,String> t1= new TreeMap<Integer,String>();
		t1.put(100,"john");
		t1.put(56,"watson");
		t1.put(45,"sherlock");
		System.out.println(t1.get(56));
		System.out.println(t1.containsKey(45));
		System.out.println(t1.containsValue("john"));
		System.out.println(t1.size());
		System.out.println(t1.isEmpty());
		System.out.println(t1.remove(56));
		
		
		Set<Map.Entry<Integer,String>> s1=t1.entrySet();
		for (Map.Entry<Integer, String> e1 : s1) {
			System.out.println("--------");
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("--------");
		}
	
	}
}
