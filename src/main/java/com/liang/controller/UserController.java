package com.liang.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.liang.entity.User;
import com.liang.service.UserService;


@Controller
@RequestMapping("userController")  //url：/模块/资源/{id}/再细分
public class UserController {
	private final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired //注入，也可使用java原生的@Resource
	private UserService userService;
	
	@RequestMapping("getUser")
	public void getUser(HttpServletRequest request, HttpServletResponse response) throws IOException{
		//getUser.jsp + model = ModelView
		User user = userService.getUserById(1);
		request. setCharacterEncoding("UTF-8");
		response.setContentType("application/json;charset=utf-8");
		ObjectMapper mapper = new ObjectMapper();
		String jsonUser = mapper.writeValueAsString(user);
		response.setContentType(jsonUser);
	}
}
