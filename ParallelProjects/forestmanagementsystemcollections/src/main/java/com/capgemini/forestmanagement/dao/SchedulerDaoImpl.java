package com.capgemini.forestmanagement.dao;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.capgemini.forestmanagement.bean.SchedulerBean;

public class SchedulerDaoImpl implements SchedulerDao{

	TreeMap<Integer, SchedulerBean> t1= new TreeMap<Integer, SchedulerBean>();
	@Override
	public void addSchedule(SchedulerBean bean) {
		if(t1.containsKey(bean.getId())) {
			System.err.println("Duplicate entry not allowed");
		} else {
			t1.put(bean.getId(),bean);
		}
	}

	@Override
	public void removeSchedule(Integer id) {
	 if(t1.containsKey(id)) {
		 t1.remove(id);
		 System.out.println("schedule removed");
	 } else {
		 System.out.println("Scheduler id not found");
	 }
	}

	@Override
	public void showSchedules() {
		if(t1.size()!=0) {
			Set<Map.Entry<Integer, SchedulerBean>> r=t1.entrySet();
			for (Map.Entry<Integer, SchedulerBean> entry : r) {
				System.out.println(entry.getValue());
			}
		} else { 
			System.out.println("No data");
		}

	}

	@Override
	public void modifySchedule(Integer id, SchedulerBean bean) {
		t1.put(id,bean);
	}

	@Override
	public SchedulerBean getSchedule(Integer id) {
		if(t1.containsKey(id)) {
			return t1.get(id);
		}
		return null;
	}

}
