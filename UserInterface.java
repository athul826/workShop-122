package com.athul;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class UserInterface {
	Scanner sc = new Scanner(System.in);
	private static UserInterface instance;
	
	private UserInterface() {
		
	}
	
	public static UserInterface getInstance() {
		if(instance == null) {
			instance = new UserInterface();
		}
		return instance;
	}
	
	public void print(Set<Pet> petList) {
		for(Pet pet : petList ) {
			System.out.println(pet);
		}
	}
	
	public int showMenu() {
		System.out.println("Select\n1.addPet\n2.printpet\n3.removePet\n4.updatePet\n5.exit");
		int choice = sc.nextInt();
		return choice;
		
	}
	
	public String selectPet() {
		System.out.println("Enter the name of pet ");
		String select = sc.next();
		return select;
	}
}
	
	/*public void printAnimal(Set<Pet> petList) {
		for(Pet pet : petList) {
			if(pet instanceof Animal ) {
				System.out.println(pet);
			}
		}
	}
	
	public void printBird(Set<Pet> petList) {
		for(Pet pet : petList) {
			if(pet instanceof Bird) {
				System.out.println(pet);
			}
		}
	}
	
	public void swimmablePet(Set<Pet> petList) {
		for(Pet pet : petList) {
			if(pet instanceof Swimmable) {
				Swimmable swimmablePet = (Swimmable) pet;
				swimmablePet.swim();
			}
		}
	}
	
	public void flyablePet(Set<Pet> petList) {
		for(Pet pet : petList) {
			if(pet instanceof Flyable) {
				Flyable flyablePet = (Flyable) pet;
				flyablePet.fly();
			}
		}
	}
}
*/
