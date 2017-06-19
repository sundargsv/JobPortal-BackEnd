package com.sundar.dao;

import java.util.List;

import com.sundar.model.Job;


public interface IJobDao {

	
	List<Job> list();
	Job getById(long id);
	
}
