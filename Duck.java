package com.athul;

public class Duck extends Bird implements Flyable, Swimmable {
	Duck(String id) {
		this.id = id;
		this.colour = Colour.WHITE;
	}

	@Override
	public void swim() {
		System.out.println("duck can swim");
	}

	@Override
	public void fly() {
		System.out.println("duck can fly");
	}

	@Override
	public void eat() {
		System.out.println("duck eats worms");
	}
}
