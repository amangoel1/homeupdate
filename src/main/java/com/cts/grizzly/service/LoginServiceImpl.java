//package com.cts.grizzly.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.cts.grizzly.bean.Login;
//import com.cts.grizzly.bean.Profile;
//import com.cts.grizzly.dao.LoginDAO;
//
//@Service
//@Transactional
//public class LoginServiceImpl implements LoginService{
//
//	@Autowired
//	private LoginDAO loginDAO;
//
//	@Override
//
//	@Transactional(readOnly = true, propagation=Propagation.SUPPORTS)
//	public Profile authenticateUser(Profile login) {
//		// TODO Auto-generated method stub
//		return loginDAO.authenticateUser(login);
//	}
//
//	@Override
//	public int getUserStatus(Profile profile) {
//		// TODO Auto-generated method stub
//		return loginDAO.getUserStatus(profile);
//	}
//
//	@Override
//	public String getUserType(Profile profile) {
//		// TODO Auto-generated method stub
//		return loginDAO.getUserType(profile);
//	}
//
//	@Override
//	public Profile checkUser(String id) {
//		// TODO Auto-generated method stub
//		return loginDAO.checkUser(id);
//	}
//
//	@Override
//	public void resetStatus(Profile profile) {
//		loginDAO.resetStatus(profile);// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void increaseAttempt(Profile profile) {
//		loginDAO.increaseAttempt(profile);// TODO Auto-generated method stub
//		
//	}
//	
//	
//}
