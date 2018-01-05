package com.dady.dubbo.consume.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dady.dubbo.api.domain.User;
import com.dady.dubbo.consume.service.UserServiceImpl;

@RestController
@RequestMapping(value = "/user")

public class UserController {
	@Autowired
	private UserServiceImpl userServiceImpl;

	@RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
	@ResponseBody
	public List<User> getAllUser() {
		return userServiceImpl.getUsers();
	}
}
