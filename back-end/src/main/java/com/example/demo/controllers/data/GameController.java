package com.example.demo.controllers.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Game;
import com.example.demo.services.GameService;

@RestController
@RequestMapping("data/game")
public class GameController {

	@Autowired
	private GameService gameService;
	
	public GameController() {
		super();
	}
	
	@GetMapping("/create")
	public Game create(@RequestParam String name) {
		return gameService.create(name);
	}
	
	@GetMapping("/list")
	public List<Game> list() {
		return gameService.findAll();
	}
}
