package com.rps.controllers;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rps.model.Game;
import com.rps.model.User;

@Service
public class GameService {
	private ArrayList<Game> games;
	private UserService users;
	
	@Autowired
	public GameService(UserService users) {
		this.users = users;
		games = new ArrayList<>();
		User user = users.exists("nate");
		User user1 = users.exists("dalia");
		games.add(new Game(user));
		games.get(0).setPlayer2(user1);
		System.out.println(games.get(0).getId());
	}
	
	public ArrayList<Game> getAllGames(){
		return games;
	}
	
	public void createGame(String playerOne) {
		User player = users.exists(playerOne);
			games.add(new Game(player));
		
		
	}
	
	public Game getGame(UUID id) {
		for(int i=0; i < games.size(); i++) {
			if (id.equals(games.get(i).getId())){
				return games.get(i);
			}
		}
		return null;
	}
	
	public void makeMove(UUID id, String user, String move) {
		Game game = getGame(id);
		if(game.getPlayer1().getUsername().equals(user)) {
			game.getPlayer1().setMove(move);
			 
		} else {
			game.getPlayer2().setMove(move);
			
		}
	}
	
	public int getWinner(UUID id) {
		return getGame(id).getWinner();
	}

}
