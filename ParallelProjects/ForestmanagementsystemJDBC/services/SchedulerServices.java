package com.cap.forestmanagementsystemjdbc.services;

import java.util.List;

import com.cap.forestmanagementsystemjdbc.bean.SchedulerBean;



public interface SchedulerServices {
	
	public boolean deleteSchedule(int scheduleId);
	
	public boolean insertSchedule(SchedulerBean sch);
	
	public List<SchedulerBean> showSchedules();

	public boolean updateSchedule(int scheduleId,String quantity);

	public boolean updateSchedule1(int scheduleId,String date);

}
