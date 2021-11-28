package com.company.factorymethod.challenge;

import java.lang.reflect.Method;
import java.util.List;

public interface Animal {
	public void makeSound();
}

class Duck implements Animal {

	@Override
	public void makeSound() {
		System.out.println(this.getClass().getSimpleName() + " makes Mac-Mac");
	}
}

class Tiger implements Animal {

	@Override
	public void makeSound() {
		System.out.println(this.getClass().getSimpleName() + " makes arrrrrrr");
	}
}
