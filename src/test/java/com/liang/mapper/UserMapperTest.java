package com.liang.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.liang.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserMapperTest {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testGetUser() {
		long id = 1000;
		User user = userMapper.getUser(id);
		System.out.println(user);
	}

	@Test
	public void testAddUser() {
		User user = new User();
		user.setUsername("li");
		user.setPassword("li");
		userMapper.addUser(user);
	}

	@Test
	public void testDeleteUser() {
		int i = userMapper.deleteUser(1001);
		System.out.println(i);
	}

	@Test
	public void testUpdateUser() {
		User user = userMapper.getUser(1000);
		user.setId(1003);
		user.setUsername("hello");
		user.setPassword("123456");
	}

	@Test
	public void testGetUsers() {
		List<User> uList = userMapper.getUsers();
		for (User user : uList) {
			logger.info(user.toString());
		}
	}

}
