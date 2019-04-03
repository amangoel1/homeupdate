package com.cts.homeservice.service;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cts.homeservice.bean.Admin;
import com.cts.homeservice.bean.Services;
import com.cts.homeservice.dao.ServiceDetailsDAO;
import com.cts.homeservice.dao.ServiceDetailsDAOImpl;


@Service
public class ServiceDetailsImpl implements ServiceDetails {
	
	@Autowired
	private ServiceDetailsDAO serviceDetailsDAOImpl;

	@Override
	public Services serviceDesc(String serviceName) {
		// TODO Auto-generated method stub
		return serviceDetailsDAOImpl.serviceDesc(serviceName);
	}
	
	
}
