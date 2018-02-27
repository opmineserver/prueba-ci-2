package com.example.demo.domain;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.SafeHtml;

public class Player {

	public Player() {
		super();
	}
	
	private String name;
	private Game game;
	
	@NotNull
	@NotBlank
	@SafeHtml
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Game getGame() {
		return game;
	}
	
	@ManyToOne
	public void setGame(Game game) {
		this.game = game;
	}
	
	
	
}
