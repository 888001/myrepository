package com.hpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hpp.bean.UserT;
import com.hpp.dao.UserService;
@Controller
@RequestMapping("/user")
public class Hello {
	@Autowired
	UserService userService;
	@RequestMapping("/hello")
	public String hello(){
		UserT userT = userService.selectAllUser();
		return "hello";
	}
}
