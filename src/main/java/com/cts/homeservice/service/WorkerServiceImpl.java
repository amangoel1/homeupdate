package com.cts.homeservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.homeservice.bean.Worker;
import com.cts.homeservice.dao.WorkerDAO;


@Service
public class WorkerServiceImpl implements WorkerService {

	@Autowired
	private WorkerDAO workerDAOImpl;
	
	
	public boolean checkUser(String email) {
		// TODO Auto-generated method stub
		return workerDAOImpl.checkUser(email);
	}

	public String addUser(Worker worker) {
		// TODO Auto-generated method stub
		return workerDAOImpl.addUser(worker);
	}

	public int getLastId() {
		// TODO Auto-generated method stub
		return workerDAOImpl.getLastId();
	}

	public Worker authenticateUser(Worker worker) {
		// TODO Auto-generated method stub
		return workerDAOImpl.authenticateUser(worker);
	}
	
	

}
