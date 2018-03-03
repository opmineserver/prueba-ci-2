package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Game;
import com.example.demo.domain.Player;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {

	@Query("select g from Game g where g.id = ?1")
	Game findOne(int id);
	
	@Query("select p from Player p where p.game.id = ?1")
	List<Player> findPlayers(int id);
	
	@Query("select g from Game g where g.name like ?1")
	Game searchGame(String name);
}
