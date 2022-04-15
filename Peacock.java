package com.athul;

public class Peacock extends Bird implements Swimmable {
	Peacock(String id) {
		this.id = id;
		this.colour = Colour.BLUE_GREEN;
	}

	@Override
	public void swim() {
		System.out.println("peacock can swim");
	}

	@Override
	public void eat() {
		System.out.println("peacock eats snake");
	}
}
