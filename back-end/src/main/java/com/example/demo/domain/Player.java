package com.example.demo.domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.SafeHtml;

@Entity
@Access(AccessType.PROPERTY)
public class Player extends DomainEntity {

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

	@ManyToOne
	public Game getGame() {
		return game;
	}
	
	public void setGame(Game game) {
		this.game = game;
	}
	
	
	
}
