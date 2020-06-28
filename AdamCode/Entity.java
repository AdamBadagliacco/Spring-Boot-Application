package com.renadam.demo;

public class Entity {
	
	private String name;
	private int initiative;
	
	public Entity(String name, int initiative) {
		super();
		this.name = name;
		this.initiative = initiative;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getInitiative() {
		return initiative;
	}
	public void setInitiative(int initiative) {
		this.initiative = initiative;
	}

}
