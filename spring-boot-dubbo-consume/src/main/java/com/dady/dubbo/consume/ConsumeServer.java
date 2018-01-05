package com.dady.dubbo.consume;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;

import com.dady.dubbo.api.domain.User;
import com.dady.dubbo.consume.service.UserServiceImpl;

@SpringBootApplication
@Controller
public class ConsumeServer {
	
	public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ConsumeServer.class, args);
       /* UserServiceImpl userService = run.getBean(UserServiceImpl.class);
        List<User> user = userService.getUsers();
        System.out.println(user.size());*/
	}
}
