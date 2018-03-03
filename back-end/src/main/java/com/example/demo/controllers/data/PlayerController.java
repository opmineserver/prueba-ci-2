package com.example.demo.controllers.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Game;
import com.example.demo.domain.Player;
import com.example.demo.services.GameService;
import com.example.demo.services.PlayerService;

@RestController
@RequestMapping("data/player")
@CrossOrigin
public class PlayerController {

	@Autowired
	private PlayerService playerService;
	
	@Autowired
	private GameService gameService;
	
	public PlayerController() {
		super();
	}
	
	@GetMapping("/join")
	public Player create(@RequestParam String name, @RequestParam int gameId) {
		Game game = gameService.findOne(gameId);
		return playerService.join(game, name);
	}
	
	@GetMapping("/list")
	public List<Player> list(@RequestParam int gameId) {
		return gameService.findPlayers(gameId);
	}
}
