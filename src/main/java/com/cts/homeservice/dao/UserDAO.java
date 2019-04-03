package com.cts.homeservice.dao;

import com.cts.homeservice.bean.User;

public interface UserDAO {
	public User authenticateUser(User login);

}
