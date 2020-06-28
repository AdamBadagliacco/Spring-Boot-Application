package com.renadam.demo;

public class Enemy extends Entity{
	
	private int hp; //Hit Points
	private int damageDice;
	
	public Enemy(String name, int initiative) {
		super(name, initiative);
		// TODO Auto-generated constructor stub
	}
	
	public Enemy(String name, int initiative, int hp, int damageDice) {
		super(name, initiative);
		this.hp = hp;
		this.damageDice = damageDice;
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getDamageDice() {
		return damageDice;
	}
	public void setDamageDice(int damageDice) {
		this.damageDice = damageDice;
	}
}
