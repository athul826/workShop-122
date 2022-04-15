package com.athul;

import java.util.Objects;

public abstract class Pet {
	enum Colour {
		BLACK, BROWN, WHITE, GREEN, BLUE_GREEN;
	}
	
	String id;
	String name;
	int price;
	Colour colour;
	
	public abstract void eat();
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		return Objects.equals(id, other.id);
	}
}
