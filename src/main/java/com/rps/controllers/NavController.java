package com.rps.controllers;


import java.util.ArrayList;
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
	private GameService service;
	
	@Autowired
	public NavController(GameService service) {
		this.service = service;
	}
	
	@GetMapping
	public ArrayList<Game> getAllGames(){
		return service.getAllGames();
	}
	
	@GetMapping(path = "/games/{id}")
	public Game getGame(@PathVariable("id") UUID id) {
		return service.getGame(id);
	}
	
	@PostMapping(path="/games")
	public void makeNewGame() {
		//finish create game function
		service.createGame();
	}
	
	@PostMapping(path = "/{id}/{username}")
	public void makeMove(@PathVariable("id") UUID id, @PathVariable("username") String username) {
		//implement move making function
	}
		
	
}
