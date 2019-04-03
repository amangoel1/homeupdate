package com.cts.homeservice.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.homeservice.bean.Services;

@Repository
@Transactional
public class ServiceDetailsDAOImpl implements ServiceDetailsDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Services serviceDesc(String serviceName) {
		
		
		
		try{
			//String service = serviceName;
			Session session = sessionFactory.getCurrentSession();
			String query = "from Service where serviceName = ?";
			Query<Services> query2 = null;
			
			query2=session.createQuery(query);
			
			query2.setParameter(0,serviceName);  
			//query2.setParameter(1,password);  
			Services user= query2.getSingleResult();
			
			if(user!=null)
			{
				
			return user;
			}
			else
			{
				
				return null;
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return null;
	}

}
