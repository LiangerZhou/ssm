package com.liang.service;

import java.util.List;

import com.liang.entity.User;

public interface UserService {
	
	User getUserById(long id);
	
	int addUser(User user);
	
	int deleteUser(long id);
	
	int updateUser(User user);
	
	List<User> getUsers();
}
