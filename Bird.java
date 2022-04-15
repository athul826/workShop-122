package com.athul;

public abstract class Bird extends Pet {
	String Speecies;

	@Override
	public String toString() {
		return "Bird [Speecies=" + Speecies + ", name=" + name + ", id=" + id + ", price=" + price + ", colour="
				+ colour + "]";
	}
}
