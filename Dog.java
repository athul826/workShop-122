package com.athul;

public class Dog extends Animal implements Swimmable {
	Dog(String id) {
		this.id = id;
		this.colour = Colour.BROWN;
	}

	@Override
	public void swim() {
		System.out.println("dog can swim");
	}

	@Override
	public void eat() {
		System.out.println("dog eats biriyani");
	}
}
