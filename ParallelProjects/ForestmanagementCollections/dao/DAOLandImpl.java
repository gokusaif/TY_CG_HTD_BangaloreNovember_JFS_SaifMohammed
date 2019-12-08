package com.cap.forestmanagement.dao;

import java.util.ArrayList;
import java.util.List;

import com.cap.forestmanagement.bean.LandDetails;

public class DAOLandImpl implements DAOLand {

	List<LandDetails> l1= new ArrayList<LandDetails>();
	
	
	public void addDetails(LandDetails l) {
		
		l1.add(l);
		
		if(l1.size()!=0) {
			System.out.println("land details added");
		} else {
			System.out.println("details not added");
		}
			
	}
	

	
	public void displayDetails() {
		if(l1.size()!=0) {
			for (LandDetails l2 : l1) {
				System.out.println(l1);
			} } else {
				System.out.println("no data");
			}
		
		}



	@Override
	public void removeContract(Integer landId) {
//		 if(l1.get(0)==landId){
//			   l1.remove(landId);
//			   System.out.println("contract removed");
//		   } else {
//			   System.out.println("contract not found");
//		   }
		
	}
	}



