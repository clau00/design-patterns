package com.company.factorymethod.challenge;

public class MainApp {

	public static void main(String[] args) {

		AnimalFactory animalFactory = new AnimalFactory();

		Animal duck = animalFactory.getAnimal("DUCK");
		duck.makeSound();

		Animal tiger = animalFactory.getAnimal("TIGER");
		tiger.makeSound();
	}

}
