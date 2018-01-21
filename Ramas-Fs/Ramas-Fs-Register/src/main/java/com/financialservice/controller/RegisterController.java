package com.financialservice.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class RegisterController {
	
	@RequestMapping("/hello")
	public String register(@PathParam("name")String name){
		return "hello " +name;
	}

}
