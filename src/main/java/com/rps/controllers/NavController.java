package com.rps.controllers;


import java.net.URI;
import java.util.List;
import java.util.UUID;

import com.rps.model.Game;
import com.rps.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("api/rps")
public class NavController {
	private final GameService gameService;
	private final UserService userService;
	@Autowired
	public NavController(UserService userService, GameService gameService) {
		this.userService = userService;
		this.gameService = gameService;

	}
	
	@GetMapping
	public List<Game> getAllGames(){
		return gameService.getAllGames();
	}
	
	@GetMapping(path = "/games/{id}")
	public ResponseEntity<Game> getGame(@PathVariable("id") UUID id) {
		Game game = gameService.getGame(id);
	    if (game == null) {
	        return ResponseEntity.notFound().build();
	    } else {
	        return ResponseEntity.ok(game);
	    }
	}
	
	@PostMapping(path="/games/{username}")
	public void makeNewGame(@PathVariable("username") String username) {
		gameService.createGame(username);
	}
	
	@PostMapping(path = "/{id}/{username}/{move}")
	public void makeMove(@PathVariable("id") UUID id, @PathVariable("username") String username, @PathVariable("move") String move) {
		
	}
	
	@GetMapping(path="/{username}")
	public ResponseEntity<User> getUserInfo(@PathVariable("username") String username) {
		User user = userService.getUserInfo(username);
		if(user == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(user);
		}
	}
	
	
		
	
}
