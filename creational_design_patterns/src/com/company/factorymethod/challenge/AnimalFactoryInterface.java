package com.company.factorymethod.challenge;

public abstract class AnimalFactoryInterface {
	public abstract AnimalInterface getAnimal(String animalType) throws Exception;
}

class AnimalFactoryImpl extends AnimalFactoryInterface {

	@Override
	public AnimalInterface getAnimal(String animalType) throws Exception {
		switch (animalType) {
			case "DUCK":
			case "duck":
			case "Duck":
				return new Duck();
			case "TIGER":
			case "tiger":
			case "Tiger":
				return new Tiger();
			default:
				throw new Exception("Animal type: " + animalType + " cannot be instantiated");
		}
	}
}
