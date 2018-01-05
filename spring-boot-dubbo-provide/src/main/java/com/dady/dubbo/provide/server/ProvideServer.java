package com.dady.dubbo.provide.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class ProvideServer {
	
	public static void main(String[] args) {
        SpringApplication.run(ProvideServer.class, args);
	}
}
