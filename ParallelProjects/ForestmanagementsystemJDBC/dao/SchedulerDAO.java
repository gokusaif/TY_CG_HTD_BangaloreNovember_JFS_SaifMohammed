package com.cap.forestmanagementsystemjdbc.dao;

import java.util.List;

import com.cap.forestmanagementsystemjdbc.bean.SchedulerBean;

public interface SchedulerDAO {
	
	
public boolean deleteSchedule(int scheduleId);
	
	public boolean insertSchedule(SchedulerBean sch);
	
	public List<SchedulerBean> showSchedules();

	public boolean updateSchedule(int scheduleId,String quantity);

	public boolean updateSchedule1(int scheduleId,String date);

}
