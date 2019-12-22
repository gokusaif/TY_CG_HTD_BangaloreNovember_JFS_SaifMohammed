package com.cap.forestmanagementsystemjdbc.services;

import java.util.List;

import com.cap.forestmanagementsystemjdbc.bean.SchedulerBean;
import com.cap.forestmanagementsystemjdbc.dao.SchedulerDAO;
import com.cap.forestmanagementsystemjdbc.factory.Factory;

public class SchedulerServicesImpl implements SchedulerServices {
	
	SchedulerDAO dao = Factory.schedulerDaoObject();

	
	public boolean deleteSchedule(int scheduleId) {
		
		return dao.deleteSchedule(scheduleId);
	}

	
	public boolean insertSchedule(SchedulerBean sch) {
		
		return dao.insertSchedule(sch);
	}

	
	public List<SchedulerBean> showSchedules() {
		
		return dao.showSchedules();
	}

	
	public boolean updateSchedule(int scheduleId, String quantity) {
		
		return dao.updateSchedule(scheduleId, quantity);
	}

	
	public boolean updateSchedule1(int scheduleId, String date) {
		
		return dao.updateSchedule1(scheduleId, date);
	}

	
	public List<SchedulerBean> viewSchedules(int schedulerId) {
		
		return dao.viewSchedules(schedulerId);
	}

}
