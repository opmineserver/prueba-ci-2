package com.example.demo.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Game;
import com.example.demo.domain.Player;
import com.example.demo.repositories.PlayerRepository;

@Service
@Transactional
public class PlayerService {

	@Autowired
	private PlayerRepository playerRepository;
	
	
	public PlayerService() {
		super();
	}
	
	
	public Player join(Game game, String name) {
		Player p = new Player();
		p.setGame(game);
		p.setName(name);
		
		p = playerRepository.save(p);
		return p;
	}
}
