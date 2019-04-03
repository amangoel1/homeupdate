package com.cts.homeservice.dao;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.hibernate.resource.transaction.spi.TransactionStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.event.TransactionPhase;


import com.cts.homeservice.bean.Admin;

@Repository
@Transactional
public class AdminDAOImpl implements AdminDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public Admin authenticateAdmin(Admin profile) {
		// TODO Auto-generated method stub
		try{
		String userId = profile.getEmail();
		String password = profile.getPwd();
		Session session = sessionFactory.getCurrentSession();
		String query = "from Admin where email = ? and pwd = ? ";
		Query<Admin> query2 = null;
		
		query2=session.createQuery(query);
		
		query2.setParameter(0,userId);  
		query2.setParameter(1,password);  
		Admin user= query2.getSingleResult();
		
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
