package com.learnprogramming.creational.builder.challenge;

public class Director {
	private MealBuilderInterface myBuilder;

	public void construct(MealBuilderInterface mealBuilder) {
		myBuilder = mealBuilder;
		myBuilder.buildBurger();
		mealBuilder.buildDrink();
	}
}
