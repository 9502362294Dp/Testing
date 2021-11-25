package com.technoelevate.encapsulation;

public class Player {

	public static void main(String[] args) {
		Pubg p = new Pubg("Himam", 125, "Erangle");
		System.out.println(p.getName());
		System.out.println(p.getHealth());
		System.out.println(p.getMap());
	}

}

//1. process of hiding the implementation details and showing the necessary things.
//2. protecting data with private keyword.
//3. if developer code changed need not to worry about user code.