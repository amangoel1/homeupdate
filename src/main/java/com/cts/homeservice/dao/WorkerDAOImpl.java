package com.cts.homeservice.dao;

import javax.persistence.TypedQuery;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.homeservice.bean.Worker;


@Repository
@Transactional
public class WorkerDAOImpl implements WorkerDAO {
	
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean checkUser(String email) {
		try{
			Session session = sessionFactory.getCurrentSession();
			String query = "from Worker where email = ?";
			Query<Worker> query2 = null;
			query2=session.createQuery(query);
			
			query2.setParameter(0,email);  
			Worker worker1= query2.getSingleResult();
			
			if(worker1!=null)
			{
				
			return true;
			}
			else
			{
				
				return false;
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return false;
			}
	}
	
	public String addUser(Worker worker) {
		try{
			sessionFactory.getCurrentSession().save(worker);
			return "success";
			}
			catch(Exception ex){
				ex.printStackTrace();
				return "failed";
			}

}
	
	public Worker authenticateUser(Worker worker) {
		try{
			String email = worker.getEmail();
			String password = worker.getPwd();
			Session session = sessionFactory.getCurrentSession();
			String query = "from Worker where email = ? and pwd = ?";
			Query<Worker> query2 = null;
			
			query2=session.createQuery(query);
			
			query2.setParameter(0,email);  
			query2.setParameter(1,password);  
			Worker user1= query2.getSingleResult();
			
			if(user1!=null)
			{
				
			return user1;
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
	
	
	public int getLastId() {
		 TypedQuery<Worker> query = sessionFactory.getCurrentSession().createQuery("from Worker order by userId DESC");
		 query.setMaxResults(1);
		 int id =  Integer.parseInt(query.getSingleResult().getUserId())+1;
	      return id;
	}

	
}


