package com.capgemini.forestmanagement.dao;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.capgemini.forestmanagement.bean.ProductDetails;

public class ProductDAOImpl implements ProductDAO{
	TreeMap<Integer,ProductDetails> l1= new TreeMap<Integer,ProductDetails>();

	@Override
	public void addDetails(ProductDetails l) {
		if(l1.containsKey(l.getProductId())) {
			System.err.println("duplicate entry for product id");
		} else {

			l1.put(l.getProductId(),l);
			System.out.println("Product details added");
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
				System.out.println(entry.getValue());
			}
		}else {
			System.out.println("no data");
		}

	}

	@Override
	public void modifyDetails(ProductDetails p) {

		l1.put(p.getProductId(), p);
		System.out.println("Product details updated");

	}

	@Override
	public ProductDetails getDetails(Integer id) {
		if(l1.containsKey(id)) {
			return l1.get(id);
		}
		return null;
	}

}
