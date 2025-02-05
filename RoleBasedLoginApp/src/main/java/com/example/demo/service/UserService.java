package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
@Service
public class UserService implements UserServiceInter {
 @Autowired
 UserRepository repository;
	public User getUserByName(String name) {
		// TODO Auto-generated method stub
		return repository.findByUsername(name);
	}

}
