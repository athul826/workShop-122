package com.athul;

import java.util.Set;

public class Main {
	
	public void userSelection (int choice) {
		UserInterface userInterface = UserInterface.getInstance();
		PetStore petStore = PetStore.getinstance();
		
		switch(choice) {
		case 1:
				addPet();
				break;
		case 2: System.out.println("printing..");
				userInterface.print(petStore.getPet());
				break;
		case 3: String userSelection = userInterface.selectPet();
				PetStore petStores = petStore.getinstance();
				Pet pet1 = petStore.getPet(userSelection);
				petStore.remove(pet1);
				break;
		case 4:
				String petName1 = userInterface.selectPet();
				PetStore petStoreForUpdate = PetStore.getinstance();
				Pet petForUpdate = petStoreForUpdate.getPet(petName1);
				petStoreForUpdate.update(petForUpdate);
				break;
		case 5:
				System.exit(0);
				break;
		default:
		}
	}
	
	public void addPet() {
		Cat cat = new Cat("C001");
		cat.name = "Cat";
		cat.breed = "Usa";
		cat.price = 1000;
		
		Dog dog = new Dog("D002");
		dog.name = "Dog";
		dog.breed = "German";
		dog.price = 2000;
		
		Dog dog1 = new Dog("D002");
		dog1.name = "Dog1";
		dog1.breed = "German";
		dog1.price = 2000;
		
		Rabbit rabbit = new Rabbit("R003");
		rabbit.name = "Rabbit";
		rabbit.breed = "Philipines";
		rabbit.price = 750;
		
		Duck duck = new Duck("D004");
		duck.name = "Duck";
		duck.Speecies = "Austria";
		duck.price = 500;
		
		Parrot parrot = new Parrot("P005");
		parrot.name = "Parrot";
		parrot.Speecies = "Neppal";
		parrot.price = 500;
		
		Peacock peacock = new Peacock("P006");
		peacock.name = "Peacock";
		peacock.Speecies = "Indian";
		peacock.price = 3500;
		
		PetStore petStore = PetStore.getinstance();
		petStore.add(peacock);
		petStore.add(parrot);
		petStore.add(duck);
		petStore.add(rabbit);
		petStore.add(dog);
		petStore.add(cat);
		petStore.add(dog1);
	}

public static void main(String[] args) {
	System.out.println("Welcome to Pet Store Management!!");
	UserInterface userInterface = UserInterface.getInstance();
	Main main = new Main();
	int choice = 0;
	while(choice!= 5) {
		choice = userInterface.showMenu();
		main.userSelection(choice);
	}
}
}
		

		
		/*Cat cat = new Cat("C001");
		cat.name = "Cat";
		cat.breed = "Usa";
		cat.price = 1000;
		
		Dog dog = new Dog("D002");
		dog.name = "Dog";
		dog.breed = "German";
		dog.price = 2000;
		
		Dog dog1 = new Dog("D002");
		dog1.name = "Dog1";
		dog1.breed = "German";
		dog1.price = 2000;
		
		Rabbit rabbit = new Rabbit("R003");
		rabbit.name = "Rabbit";
		rabbit.breed = "Philipines";
		rabbit.price = 750;
		
		Duck duck = new Duck("D004");
		duck.name = "Duck";
		duck.Speecies = "Austria";
		duck.price = 500;
		
		Parrot parrot = new Parrot("P005");
		parrot.name = "Parrot";
		parrot.Speecies = "Neppal";
		parrot.price = 500;
		
		Peacock peacock = new Peacock("P006");
		peacock.name = "Peacock";
		peacock.Speecies = "Indian";
		peacock.price = 3500;
		
		PetStore petStore = new PetStore();
		petStore.add(peacock);
		petStore.add(parrot);
		petStore.add(duck);
		petStore.add(rabbit);
		petStore.add(dog);
		petStore.add(cat);
		petStore.add(dog1);
		
		UserInterface userInterface = new UserInterface();
		userInterface.print(petStore.getPet());
		
		petStore.remove(peacock);
		System.out.println("Peacock has been removed successfuly");
		userInterface.print(petStore.getPet());
		
		System.out.println("printing animals only");
		userInterface.printAnimal(petStore.getPet());
		
		System.out.println("printing birds only");
		userInterface.printBird(petStore.getPet());
		
		System.out.println("printing swimmable pets only");
		userInterface.swimmablePet(petStore.getPet());
		
		System.out.println("printing flyable pet only");
		userInterface.flyablePet(petStore.getPet());
	}
}
*/

