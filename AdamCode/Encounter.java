package com.renadam.demo;

public class Encounter {
	private String name; 
	private Entity entity[];
	private String notes;
	
	public Encounter(String name, Entity[] entity, String notes) {
		super();
		this.name = name;
		this.entity = entity;
		this.notes = notes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Entity[] getEntity() {
		return entity;
	}
	public void setEntity(Entity[] entity) {
		this.entity = entity;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
}
