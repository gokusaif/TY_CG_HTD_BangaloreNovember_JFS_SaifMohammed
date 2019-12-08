package com.cap.forestmanagement.dao;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.cap.forestmanagement.bean.ContractDetails;

public class DAOImpl implements DAO {

TreeMap<Integer,ContractDetails> l1= new TreeMap<Integer,ContractDetails>();
	
	public void contractDetails(Integer productId,int contractNo, int customerId, int haulierId,
			String deliveryDate, String deliveryDay, int quantity) {
		ContractDetails details= new ContractDetails();
		details.setProductId(productId);
		details.setContractNo(contractNo);
		details.setCustomerId(customerId);
		details.setHaulierId(haulierId);
		details.setDeliveryDate(deliveryDate);
		details.setDeliveryDay(deliveryDay);
		details.setQuantity(quantity);
	    l1.put(productId,details);
		if(l1.size() != 0) {
		    System.out.println("contract added");
		} else {
			System.out.println("not added");
		}
		
	}
	
	public void showAll(){
			if(l1.size()!=0) {
			  Set<Map.Entry<Integer, ContractDetails>> s1= l1.entrySet();
			  for (Map.Entry<Integer, ContractDetails> entry : s1) {
				System.out.println(entry);
			}
			}else {
				System.out.println("no data");
			}
	
	}

	@Override
	public void removeContract(Integer productId) {

		  if(l1.containsKey(productId)){
			   l1.remove(productId);
			   System.out.println("contract removed");
		   } else {
			   System.out.println("contract not found");
		   }
}

	@Override
	public boolean modifyContract(Integer productId) {
		if(l1.containsKey(productId)){
			  return true;
		   } else {
			 return false;
		   }
		
		
	}
}



