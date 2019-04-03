package com.cts.homeservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import com.cts.homeservice.bean.Admin;
import com.cts.homeservice.bean.User;
import com.cts.homeservice.dao.AdminDAO;

@Service
//@Transactional
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminDAO loginDAO;


	@Override
	
	@Transactional(readOnly = true, propagation=Propagation.SUPPORTS)
	public Admin authenticateAdmin(Admin login) {
		// TODO Auto-generated method stub
		return loginDAO.authenticateAdmin(login);
	}

		
	

	
	
}
