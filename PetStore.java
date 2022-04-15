package com.athul;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PetStore {
	Scanner sc = new Scanner(System.in);
	private static PetStore instance;
	
	Set<Pet> petList = new HashSet<>();
	
	private PetStore() {
		
	}
	
	public static PetStore getinstance() {
		if(instance == null) {
			instance = new PetStore();
		}
		return instance;
	}
	
	public void add(Pet pet) {
		petList.add(pet);
	}
	
	public void remove(Pet pet) {
		petList.remove(pet);
	}
	
	public Set<Pet> getPet() {
		return petList;
	}
	
	public Pet getPet(String name) {
		for(Pet pet : petList) {
			if(name.equalsIgnoreCase(pet.name)) {
				return pet;
			}
		}
		return null;
	}
	
	public void update(Pet pet) {
		System.out.println("Select\n1.Update pet name\n2.update pet price\n.update colour");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
				System.out.println("Enter new name of pet");
				pet.name = sc.next();
				break;
		case 2:	System.out.println("enter price of pet");
				pet.price = sc.nextInt();
				break;
		case 3:
				break;
		
		}
	}
}
