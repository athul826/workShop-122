package com.athul;

public class Rabbit extends Animal implements Swimmable {
	Rabbit(String id) {
		this.id = id;
		this.colour = Colour.WHITE;
	}

	@Override
	public void swim() {
		System.out.println("rabbit can swim");
	}

	@Override
	public void eat() {
		System.out.println("Rabbit eats carrot");
	}
}
