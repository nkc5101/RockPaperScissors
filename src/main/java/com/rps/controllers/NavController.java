package com.rps.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/rps")
public class NavController {
	private GameService service;
	
	@Autowired
	public NavController() {
		service = new GameService();
	}
	
	@GetMapping
	public
}
