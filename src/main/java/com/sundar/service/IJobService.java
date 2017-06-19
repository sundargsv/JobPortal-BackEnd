package com.sundar.service;

import java.util.List;

import com.sundar.model.Job;

public interface IJobService {

	String getMsg();
	List<Job> getJobs();
	Job getById(long id);
}
