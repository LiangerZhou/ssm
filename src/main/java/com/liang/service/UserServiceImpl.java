package com.liang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.liang.entity.User;
import com.liang.mapper.UserMapper;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	
	@Override
	public User getUserById(long id) {
		return userMapper.getUser(id);
	}

	@Override
	@Transactional
	public int addUser(User user) {
		return userMapper.addUser(user);
	}

	@Override
	@Transactional
	public int deleteUser(long id) {
		return userMapper.deleteUser(id);
	}

	@Override
	@Transactional
	public int updateUser(User user) {
		return userMapper.updateUser(user);
	}

	@Override
	public List<User> getUsers() {
		return userMapper.getUsers();
	}

}
