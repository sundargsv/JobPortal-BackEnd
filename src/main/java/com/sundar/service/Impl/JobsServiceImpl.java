package com.sundar.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sundar.dao.IJobDao;
import com.sundar.model.Job;
import com.sundar.service.IJobService;

@Service
public class JobsServiceImpl implements IJobService{

	@Autowired
	private IJobDao jobDao;
	

	public IJobDao getJobDao() {
		return jobDao;
	}

	public void setJobDao(IJobDao jobDao) {
		this.jobDao = jobDao;
	}

	public String getMsg() {
		
		return "My RESTFfull is working !!!";
	}

	@Transactional
	public List<Job> getJobs() {
		/*Job obj = new Job();
		obj.setId(1000);
		obj.setTitle("Full stack developer");
		obj.setJobDescription("qwerty");
		obj.setLocation("Hyderabad");*/
		
		List<Job> jobList = jobDao.list();
		
		return jobList;
	}
	
	@Transactional
	public Job getById(long id) {
		Job job = jobDao.getById(id);
		return job;
	}

}
