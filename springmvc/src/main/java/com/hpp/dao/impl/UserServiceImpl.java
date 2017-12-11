package com.hpp.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hpp.bean.UserT;
import com.hpp.dao.UserService;
import com.hpp.mapper.UserTMapper;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserTMapper userTMapper;

	public UserT selectAllUser() {
		return userTMapper.selectAllUser();
	}

}
