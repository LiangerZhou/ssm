package com.liang.mapper;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.liang.entity.User;

@MapperScan
public interface UserMapper {
	
	User getUser(long id);
	
	int addUser(User user);
	
	int deleteUser(long id);
	
	int updateUser(User user);
	
	List<User> getUsers();
}
