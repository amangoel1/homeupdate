package com.cts.homeservice.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.homeservice.bean.User;


@Repository
@Transactional
public class RegisterUserDAOImpl implements RegisterUserDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public String registerUser(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(user);
		return "success";
	}

}
