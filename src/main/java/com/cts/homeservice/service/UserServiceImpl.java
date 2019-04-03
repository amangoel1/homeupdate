package com.cts.homeservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.homeservice.bean.User;
import com.cts.homeservice.dao.UserDAO;


@Service
//@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO loginDAO;

	
	@Override
	@Transactional(readOnly = true, propagation=Propagation.SUPPORTS)
	public User authenticateUser(User login) {
		// TODO Auto-generated method stub
		return loginDAO.authenticateUser(login);
	}

}
