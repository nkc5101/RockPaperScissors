package com.rps.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	private String username;
	private String password;
	private String move;
	
	public User(@JsonProperty String username, @JsonProperty String password) {
		this.username = username;
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMove() {
		return move;
	}
	public void setMove(String move) {
		this.move = move;
	}
	
	
}
