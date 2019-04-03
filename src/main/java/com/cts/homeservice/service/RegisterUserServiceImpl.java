package com.cts.homeservice.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.homeservice.bean.User;
import com.cts.homeservice.dao.RegisterUserDAO;


@Service
//@Transactional
public class RegisterUserServiceImpl implements RegisterUserService {
	
	@Autowired
	private RegisterUserDAO registerUserDAO;

	@Override
	public String registerUser(User user) {
		// TODO Auto-generated method stub
		return registerUserDAO.registerUser(user);
	}

}
