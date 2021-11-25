package com.technoelvate.constructor1;

public class main {

	public static void main(String[] args) {
		Computer c = new Computer("DELL", "5510", "SILVER");
		System.out.println(c.getColour());
		System.out.println(c.getModel());
		System.out.println(c.getName());
	}

}

//1. Constructor is a special type of method.
//2. with the help of class Name Only we can create constructor.
//3. when ever we create object the constructor will initialize
//   (when we create an object then the constructor will get activated).
//4. new operator is responsible to call constructor.
//5. why constructor is use to initialize variables.
//6. Only Non-Static variables are used in constructors.