package com.learnprogramming.creational.builder;

public class Director {
	BuilderInterface myBuilder;

	public void construct(BuilderInterface builder) {
		myBuilder = builder;
		myBuilder.addBody();
		myBuilder.addWheels();
		myBuilder.addHeadlights();
	}
}
