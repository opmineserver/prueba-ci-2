package com.example.demo.domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.SafeHtml;

@Entity
@Access(AccessType.PROPERTY)
public class Game extends DomainEntity {

	public Game() {
		super();
	}
	
	private String name;
	private boolean started;
	private Date creation;
	
	@NotNull
	@NotBlank
	@SafeHtml
	@Column(unique = true)
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isStarted() {
		return started;
	}
	
	public void setStarted(boolean started) {
		this.started = started;
	}
	
	@Past
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	public Date getCreation() {
		return creation;
	}
	
	public void setCreation(Date creation) {
		this.creation = creation;
	}
}
