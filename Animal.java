package com.athul;

public abstract class Animal extends Pet {
	String breed;

	@Override
	public String toString() {
		return "Animal [breed=" + breed + ", name=" + name + ", id=" + id + ", price=" + price + ", colour=" + colour
				+ "]";
	}
}
