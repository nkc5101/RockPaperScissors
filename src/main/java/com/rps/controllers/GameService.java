package com.rps.controllers;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.rps.model.Game;
import com.rps.model.User;

public class GameService {
	private ArrayList<Game> games;
	
	@Autowired
	public GameService() {
		games = new ArrayList<>();
	}
	
	public ArrayList<Game> getAllGames(){
		return games;
	}
	
	public void createGame(User playerOne, User playerTwo) {
		games.add(new Game(playerOne, playerTwo));
	}
	
	public Game getGame(UUID id) {
		for(int i=0; i < games.size(); i++) {
			if (games.get(i).getId().equals(id)){
				return games.get(i);
			}
		}
		return null;
	}
	
}
