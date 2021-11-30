package com.company.builder.challenge;

public interface MealBuilderInterface {
	void buildBurger();
	void buildDrink();
	Meal getMeal();
}

class VegMealBuilder implements MealBuilderInterface {
	private Meal meal = new Meal();

	@Override
	public void buildBurger() {
		PackingInterface packing = new Wrapper();
		Burger vegBurger = new VegBurger("Vegan Burger", 35.0, packing);
		meal.addItem(vegBurger);
	}

	@Override
	public void buildDrink() {
		PackingInterface packing = new Bottle();
		ColdDrink coke = new Coke("Coke", 12.0, packing);
		meal.addItem(coke);
	}

	@Override
	public Meal getMeal() {
		return meal;
	}
}

class NonVegMealBuilder implements MealBuilderInterface {
	private Meal meal = new Meal();

	@Override
	public void buildBurger() {
		PackingInterface packing = new Wrapper();
		Burger chickenBurger = new VegBurger("Chicken Burger", 42.20, packing);
		meal.addItem(chickenBurger);
	}

	@Override
	public void buildDrink() {
		PackingInterface packing = new Bottle();
		ColdDrink pepsi = new Pepsi("Pepsi", 11.0, packing);
		meal.addItem(pepsi);
	}

	@Override
	public Meal getMeal() {
		return meal;
	}
}
