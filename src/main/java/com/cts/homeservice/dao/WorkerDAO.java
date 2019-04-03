package com.cts.homeservice.dao;

import com.cts.homeservice.bean.Worker;

public interface WorkerDAO {
	public boolean checkUser(String email);

	String addUser(Worker worker);

	int getLastId();

	Worker authenticateUser(Worker worker);
}
