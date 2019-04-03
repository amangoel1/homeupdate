package com.cts.homeservice.service;

import com.cts.homeservice.bean.Worker;

public interface WorkerService {

	public boolean checkUser(String email);

	String addUser(Worker worker);

	int getLastId();

	Worker authenticateUser(Worker worker);
}
