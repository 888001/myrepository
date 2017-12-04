package com.hpp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/user")
public class Hello {
	@RequestMapping("/hello")
	public String hello(){
		return "hello";
	}
}
