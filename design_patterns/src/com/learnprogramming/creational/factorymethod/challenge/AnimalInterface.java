package com.learnprogramming.creational.factorymethod.challenge;

public interface AnimalInterface {
	public void makeSound();
}

class Duck implements AnimalInterface {

	@Override
	public void makeSound() {
		System.out.println(this.getClass().getSimpleName() + " makes Mac-Mac");
	}
}

class Tiger implements AnimalInterface {

	@Override
	public void makeSound() {
		System.out.println(this.getClass().getSimpleName() + " makes arrrrrrr");
	}
}
