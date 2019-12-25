package com.capgemini.forestmanagement.dao;

import com.capgemini.forestmanagement.bean.SchedulerBean;

public interface SchedulerDao {
	
	public void addSchedule(SchedulerBean bean);
	
	public void removeSchedule(Integer id);
	
	public void showSchedules();
	
	public void modifySchedule(Integer id,SchedulerBean bean);
	
	public SchedulerBean getSchedule(Integer id);

}
