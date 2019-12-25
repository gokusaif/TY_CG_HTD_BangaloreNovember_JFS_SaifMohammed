package com.capgemini.forestmanagement.services;

import com.capgemini.forestmanagement.bean.SchedulerBean;
import com.capgemini.forestmanagement.dao.SchedulerDao;
import com.capgemini.forestmanagement.factory.Factory;

public class SchedulerServicesImpl implements SchedulerServices{
	SchedulerDao dao= Factory.objectSchedulerDao();
	@Override
	public void addSchedule(SchedulerBean bean) {
		dao.addSchedule(bean);
	}

	@Override
	public void removeSchedule(Integer id) {
		dao.removeSchedule(id);
	}

	@Override
	public void showSchedules() {
		dao.showSchedules();
	}

	@Override
	public void modifySchedule(Integer id, SchedulerBean bean) {
		dao.modifySchedule(id, bean);
	}

	@Override
	public SchedulerBean getSchedule(Integer id) {
		
		return dao.getSchedule(id);
	}

}
