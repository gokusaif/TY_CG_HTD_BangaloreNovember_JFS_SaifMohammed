package com.cap.forestmanagement.dao;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


import com.cap.forestmanagement.bean.ProductDetails;

public class ProductDAOImpl implements ProductDAO{
	TreeMap<Integer,ProductDetails> l1= new TreeMap<Integer,ProductDetails>();

	@Override
	public void addDetails(Integer productId, ProductDetails l) {
		l1.put(productId,l);

		if(l1.size()!=0) {
			System.out.println("product details added");
		} else {
			System.out.println("details not added");
		}


	}

	@Override
	public void removeDetail(Integer landId) {

		if(l1.containsKey(landId)){
			l1.remove(landId);
			System.out.println("product details removed");
		} else {
			System.out.println("product details not found");
		}

	}

	@Override
	public void displayDetails() {
		if(l1.size()!=0) {
			Set<Map.Entry<Integer, ProductDetails>> s1= l1.entrySet();
			for (Map.Entry<Integer, ProductDetails> entry : s1) {
				System.out.println(entry);
			}
		}else {
			System.out.println("no data");
		}

	}

}
