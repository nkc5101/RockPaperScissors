package com.rps.controllers;

import java.util.ArrayList;
import com.rps.model.User;


public class UserService {
	private ArrayList<User> userList;
	
	public UserService() {
		userList = new ArrayList<>();
		userList.add(new User("nate", "test1"));
		userList.add(new User("dalia", "test2"));
	}
	
	public User exists(String username) {
		for (int i = 0; i < userList.size(); i++) {
			if(userList.get(i).getUsername().equals(username)) {
				return userList.get(i);
			}
		}
		return new User("user", "password");
	}
	
	
}
