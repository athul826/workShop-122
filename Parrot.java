package com.athul;

public class Parrot extends Bird implements Swimmable {
	Parrot(String id) {
		this.id = id;
		this.colour = Colour.GREEN;
	}

	@Override
	public void swim() {
		System.out.println("parrot can swim");
	}

	@Override
	public void eat() {
		System.out.println("parrot eats flies");
	}
}
