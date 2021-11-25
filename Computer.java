package com.technoelevate.encapsulation1;

public class Computer {
	private String name;
	private String colour;
	private int modelnumber;

	public Computer(String name, String colour, int modelnumber) {
		this.name = name;
		this.colour = colour;
		this.modelnumber = modelnumber;
	}

	public String getName() {
		return name;
	}

	public String getColour() {
		return colour;
	}

	public int getModelnumber() {
		return modelnumber;
	}

}
