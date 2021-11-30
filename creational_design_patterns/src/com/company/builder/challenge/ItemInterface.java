package com.company.builder.challenge;

public interface ItemInterface {
	public String getName();
	public double getPrice();
	public PackingInterface getPacking();
}

abstract class Burger implements ItemInterface {
	private String name;
	private double price;
	private PackingInterface packing;

	Burger(String name, double price, PackingInterface packing) {
		this.name = name;
		this.price = price;
		this.packing = packing;
	}

	@Override
	public PackingInterface getPacking() {
		return packing;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getPrice() {
		return price;
	}
}

class VegBurger extends Burger {

	public VegBurger(String name, double price, PackingInterface packing) {
		super(name, price, packing);
	}

}

class ChickenBurger extends Burger {

	public ChickenBurger(String name, double price, PackingInterface packing) {
		super(name, price, packing);
	}

}

abstract class ColdDrink implements ItemInterface {
	private String name;
	private double price;
	private PackingInterface packing;

	protected ColdDrink(String name, double price, PackingInterface packing) {
		this.name = name;
		this.price = price;
		this.packing = packing;
	}

	@Override
	public PackingInterface getPacking() {
		return packing;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getPrice() {
		return price;
	}
}

class Coke extends ColdDrink {
	public Coke(String name, double price, PackingInterface packing) {
		super(name, price, packing);
	}
}

class Pepsi extends ColdDrink {
	public Pepsi(String name, double price, PackingInterface packing) {
		super(name, price, packing);
	}
}

