package com.sundar.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sundar.model.Job;
import com.sundar.service.IJobService;

@RestController
public class JobsController {

	@Autowired
	IJobService jobService;
	
	 @RequestMapping(value = "/openJobs", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Job> getAllOpenJobs(){
		
		List<Job> jobList = jobService.getJobs();
		System.out.println(jobList.size());
		return jobList;
		
	}
	 
	 @RequestMapping(value = "/job/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
		public Job getJobById(@PathVariable long id){
			
			Job job = jobService.getById(id);
			return job;
			
		}
}
