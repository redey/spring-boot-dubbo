package com.dady.dubbo.consume.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dady.dubbo.api.domain.User;
import com.dady.dubbo.api.service.IUserService;
@Component
public class UserServiceImpl {
    @Reference(version = "1.0.0")
    public IUserService userService;
	
	public List<User> getUsers(){
		return userService.getAllUser();
	}

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	
	
}
