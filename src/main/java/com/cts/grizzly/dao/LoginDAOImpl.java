//package com.cts.grizzly.dao;
//
//import javax.transaction.Transactional;
//import javax.transaction.Transactional.TxType;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
//import org.hibernate.resource.transaction.spi.TransactionStatus;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.event.TransactionPhase;
//
////import com.cts.grizzly.bean.Login;
//import com.cts.grizzly.bean.Profile;
//
//@Repository
//@Transactional
//public class LoginDAOImpl implements LoginDAO {
//	
//	@Autowired
//	private SessionFactory sessionFactory;
//
//	@Override
//	public Profile authenticateUser(Profile profile) {
//		// TODO Auto-generated method stub
//		try{
//		String userName = profile.getUserName();
//		String password = profile.getPassword();
//		Session session = sessionFactory.getCurrentSession();
//		String query = "from Profile where userName = ? and password = ?";
//		Query<Profile> query2 = null;
//		
//		query2=session.createQuery(query);
//		
//		query2.setParameter(0,userName);  
//		query2.setParameter(1,password);  
//		Profile user= query2.getSingleResult();
//		
//		if(user!=null)
//		{
//			
//		return user;
//		}
//		else
//		{
//			
//			return null;
//			}
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		return null;
//	}
//
//	@Override
//	public int getUserStatus(Profile profile) {
//		// TODO Auto-generated method stub
//	
////			String userName = profile.getUserName();
////			String password = profile.getPassword();
////			Session session = sessionFactory.getCurrentSession();
////			String query = "select userStatus from Profile where userName = ?";
////			Query<Profile> query2 = null;
////			
////			query2=session.createQuery(query);
////			
////			query2.setParameter(0,userName);  
////			//query2.setParameter(1,password);  
////			Profile user= query2.getSingleResult();
////			
////			if(user!=null)
////			{
//	
//			return profile.getUserStatus();
////			}
////			else
////			{
////				
////				return 0;
////				}
////			}
////			catch(Exception e)
////			{
////				e.printStackTrace();
////			}
////		return 0;
//	}
//
//	@Override
//	public String getUserType(Profile profile) {
//		
////		try{
////			String userName = profile.getUserName();
////			//String password = profile.getPassword();
////			Session session = sessionFactory.getCurrentSession();
////			String query = "select userType from Profile where userName = ? ";
////			Query<Profile> query2 = null;
////			
////			query2=session.createQuery(query);
////			
////			query2.setParameter(0,userName);  
////			//query2.setParameter(1,password);  
////			Profile user= query2.getSingleResult();
////			
////			if(user!=null)
////			{
//				
//			return profile.getUserType();
////			}
////			else
////			{
////				
////				return null;
////				}
////			}
////			catch(Exception e)
////			{
////				e.printStackTrace();
////			}// TODO Auto-generated method stub
////		return null;
//	}
//
//	@Override
//	public Profile checkUser(String id) {
//		
//		
//		try{
//	//String userName = profile.getUserName();
////			String password = profile.getPassword();
//			Session session = sessionFactory.getCurrentSession();
//			String query = "from Profile where userName = ?";
//			Query<Profile> query2 = null;
//			
//			query2=session.createQuery(query);
//			
//		query2.setParameter(0,id);  
////			query2.setParameter(1,password);  
//			Profile user= query2.getSingleResult();
//			
//			if(user!=null)
//			{
//				
//			return user;
//			}
//			else
//			{
//				
//				return null;
//				}
//			}
//			catch(Exception e)
//			{
//				e.printStackTrace();
//			}// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void resetStatus(Profile profile) {
//		// TODO Auto-generated method stub
//		profile.setUserStatus(1);
//		sessionFactory.getCurrentSession().saveOrUpdate(profile);
//	}
//
//	@Override
//	public void increaseAttempt(Profile profile) {
//		// TODO Auto-generated method stub
//		System.out.println(profile.getUserStatus());
//		profile.setUserStatus(profile.getUserStatus()+1);
//		sessionFactory.getCurrentSession().saveOrUpdate(profile);
//	}
//	
//
//
//}
