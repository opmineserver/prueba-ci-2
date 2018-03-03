package com.example.demo.services;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Game;
import com.example.demo.domain.Player;
import com.example.demo.repositories.GameRepository;

@Service
@Transactional
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	
	public GameService() {
		super();
	}
	
	
	public Game create(String name) {
		Game game = new Game();
		game.setName(name);
		game.setCreation(new Date(System.currentTimeMillis()-1));
		
		game = gameRepository.save(game);
		return game;
	}
	
	public List<Game> findAll() {
		return gameRepository.findAll();
	}
	
	public Game findOne(int id) {
		return gameRepository.findOne(id);
	}
	
	public List<Player> findPlayers(int id) {
		return gameRepository.findPlayers(id);
	}
	
	public Game searchGame(String name) {
		return gameRepository.searchGame(name);
	}
}
