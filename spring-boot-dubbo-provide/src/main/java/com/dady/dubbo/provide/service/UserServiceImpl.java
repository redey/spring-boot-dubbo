package com.dady.dubbo.provide.service;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.dubbo.config.annotation.Service;

import com.dady.dubbo.api.domain.User;
import com.dady.dubbo.api.service.IUserService;
@Service(version = "1.0.0")
public class UserServiceImpl implements IUserService {

	public List<User> getAllUser() {
		List<User> users = new ArrayList<User>();
		User u = new User();
		u.setUserName("linqigang");
		u.setPassword("test");
		users.add(u);
		return users;
	}

}
