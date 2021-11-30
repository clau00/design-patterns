package com.company.builder.challenge;

public class Client {

	public static void main(String[] args) {

		Director director = new Director();

		MealBuilderInterface veganMealBuilder = new VegMealBuilder();
		MealBuilderInterface nonVeganMealBuilder = new NonVegMealBuilder();

		director.construct(veganMealBuilder);
		Meal vegMeal = veganMealBuilder.getMeal();
		System.out.println("Vegan Meal:");
		vegMeal.showItems();

		director.construct(nonVeganMealBuilder);
		Meal nonVegMeal = nonVeganMealBuilder.getMeal();
		System.out.println("Non-Vegan Meal:");
		nonVegMeal.showItems();
	}
}
