package com.sundar.dao.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sundar.dao.IJobDao;
import com.sundar.model.Job;

@Repository
public class JobDaoImpl implements IJobDao {

	@Autowired
	private SessionFactory sessionFactory ;   
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public List<Job> list(){
		List<Job> JobList = null;
		System.out.println("JobDaoImpl.list");
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		try{
			JobList = (List<Job>) session.createCriteria(Job.class).list();
			
			tx.commit();
	}catch(HibernateException e){
			if(tx != null){
				tx.rollback();
			}
			e.printStackTrace(); 
		}finally {
			session.close();
		}
		
		return JobList;
		
	}

	@Transactional
	public Job getById(long id) {
		Job job = null;
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		try{
			job = (Job) session.get(Job.class, id);
			
		}catch(HibernateException e){
			e.printStackTrace(); 
		}finally {
			session.close();
		}
		
		return job;
	}

	

	

}
