package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/userapi")
public class UserController {
	   @Autowired
	   UserService service;
	   @PostMapping("/login")
	   public String login(@RequestParam("username") String username,@RequestParam("password") String password) {
		User user=service.getUserByName(username);
		if(user!=null && user.getPassword().equals(password)) {
		   if(user.getRole().equals("ADMIN")) {
			   return "THIS is ADMIN PAGE";
		   }
		   else {
			   return "THIs IS CUSTOMER PAGE";
		   }
	   }
		return "INVALID CREDENTIALS TRY AGAIN";
	   }
}
		

