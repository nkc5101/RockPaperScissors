package com.rps.controllers;


import java.util.List;
import java.util.UUID;

import com.rps.model.Game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/rps")
public class NavController {
	private final GameService gameService;
	private final UserService userService;
	@Autowired
	public NavController(GameService gameService, UserService userService) {
		this.gameService = gameService;
		this.userService = userService;
	}
	
	@GetMapping
	public List<Game> getAllGames(){
		return gameService.getAllGames();
	}
	
	@GetMapping(path = "/games/{id}")
	public Game getGame(@PathVariable("id") UUID id) {
		return gameService.getGame(id);
	}
	
	@PostMapping(path="/games/{username}")
	public void makeNewGame(@PathVariable("username") String username) {
		gameService.createGame(username);
	}
	
	@PostMapping(path = "/{id}/{username}/{move}")
	public void makeMove(@PathVariable("id") UUID id, @PathVariable("username") String username, @PathVariable("move") String move) {
		
	}
	
	@GetMapping(path="/{username}")
	public void getUserInfo(@PathVariable("username") String username) {
		userService.getUserInfo(username);
	}
	
	
		
	
}
