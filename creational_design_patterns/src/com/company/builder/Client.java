package com.company.builder;

public class Client {

	public static void main(String[] args) {

		BuilderInterface carBuilder = new Car();
		BuilderInterface motorcycleBuilder = new Motorcycle();

		Director director = new Director();

		director.construct(carBuilder);
		Vehicle car = carBuilder.getVehicle();
		car.showParts();

		director.construct(motorcycleBuilder);
		Vehicle motorcycle = motorcycleBuilder.getVehicle();
		motorcycle.showParts();
	}
}
