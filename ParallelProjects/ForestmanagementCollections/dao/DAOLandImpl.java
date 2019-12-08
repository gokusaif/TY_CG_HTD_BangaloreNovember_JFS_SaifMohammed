package com.cap.forestmanagement.dao;



import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


import com.cap.forestmanagement.bean.LandDetails;

public class DAOLandImpl implements DAOLand {

	TreeMap<Integer,LandDetails> l1= new TreeMap<Integer,LandDetails>();
	
	
	public void addDetails(Integer landId,LandDetails l) {
		
		l1.put(landId,l);
		
		if(l1.size()!=0) {
			System.out.println("land details added");
		} else {
			System.out.println("details not added");
		}
			
	}
	

	
	public void displayDetails() {
		if(l1.size()!=0) {
			  Set<Map.Entry<Integer, LandDetails>> s1= l1.entrySet();
			  for (Map.Entry<Integer, LandDetails> entry : s1) {
				System.out.println(entry);
			}
			}else {
				System.out.println("no data");
			}
		
		}



	@Override
	public void removeContract(Integer landId) {
		if(l1.containsKey(landId)){
			   l1.remove(landId);
			   System.out.println("land details removed");
		   } else {
			   System.out.println("land details not found");
		   }
		
	}
	}



