package com.cts.homeservice.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.homeservice.bean.Admin;
import com.cts.homeservice.bean.User;


@Repository
@Transactional
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;


	@Override
	public User authenticateUser(User profile) {
		// TODO Auto-generated method stub
		
			try{
			String userId = profile.getEmail();
			String password = profile.getPwd();
			Session session = sessionFactory.getCurrentSession();
			String query = "from User where email = ? and pwd = ? ";
			Query<User> query2 = null;
			
			query2=session.createQuery(query);
			
			query2.setParameter(0,userId);  
			query2.setParameter(1,password);  
			User user= query2.getSingleResult();
			
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
