package com.athul;

public class Cat extends Animal implements Swimmable {
	Cat(String id) {
		this.id = id;
		this.colour = Colour.BLACK;
	}

	@Override
	public void swim() {
		System.out.println("cat can swim");
	}

	@Override
	public void eat() {
		System.out.println("Cat drinks milk");
	}
}
