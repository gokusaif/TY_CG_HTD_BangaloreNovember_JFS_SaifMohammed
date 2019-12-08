package com.cap.map.linkedHashMap;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap1 {
	public static void main(String[] args) {
		LinkedHashMap<String,Integer> l1= new LinkedHashMap<String,Integer>();
		l1.put("BTM",560002);
		l1.put("Hebbal",560023);		
		l1.put(null,null);
		l1.put(null,560022);
		l1.put("BTR",560022);
	    l1.remove("BTR");
	    System.out.println(l1.containsValue(560001));
	    System.out.println(l1.containsKey("BTM"));
	    System.out.println(l1.size());
	    System.out.println(l1.isEmpty());
	    System.out.println("keys");
	    Collection<String> c1= l1.keySet();
	    for (String s1 : c1) {
			System.out.println(s1);
		}
	    System.out.println("values");
	    Collection<Integer> c2= l1.values();
	    for (Integer i1 : c2) {
			System.out.println(i1);
		}
	    
		Set<Map.Entry<String,Integer>> s1=l1.entrySet();
		for (Map.Entry<String, Integer> e1 : s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("--------");
		}
	}
}
