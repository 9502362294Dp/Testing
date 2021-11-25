package com.technoelevate.encapsulation;

public class Pubg {

	private String name;
	private int health = 100;
	private String map;

	// initialize
	public Pubg(String name, int health, String map) {
		// this shows here current object.
		this.name = name;
		if (health > 0 && health <= 100) {
			this.health = health;
		}
		this.map = map;
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public String getMap() {
		return map;
	}

}
