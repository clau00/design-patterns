package com.company.factorymethod.challenge;

public class MainApp {

	public static void main(String[] args) throws Exception {

		AnimalFactoryInterface animalFactory = new AnimalFactoryImpl();

		AnimalInterface duck = animalFactory.getAnimal("DUCK");
		duck.makeSound();

		AnimalInterface tiger = animalFactory.getAnimal("TIGER");
		tiger.makeSound();

		AnimalInterface lion = animalFactory.getAnimal("LION");
		tiger.makeSound();
	}

}
