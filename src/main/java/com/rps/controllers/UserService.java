package com.rps.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rps.model.User;

@Service
public class UserService {
	private ArrayList<User> userList;
	@Autowired
	public UserService() {
		userList = new ArrayList<>();
		userList.add(new User("nate", "test1"));
		userList.add(new User("dalia", "test2"));

	}
	
	public User exists(String username) {
		for (int i = 0; i < userList.size(); i++) {
			if(username.equals(userList.get(i).getUsername())) {
				return userList.get(i);
			}
		}
		return new User("user", "password");
	}
	
	public User getUserInfo(String username) {
		for (int i = 0; i < userList.size(); i++) {
			if(username.equals(userList.get(i).getUsername())) {
				return userList.get(i);
			}
		}
		return new User("user", "password");
	}
	
}
