package com.company.builder;

public interface BuilderInterface {
	public void addBody();
	public void addWheels();
	public void addHeadlights();
	public Vehicle getVehicle();
}

class Car implements BuilderInterface {
	private Vehicle vehicle = new Vehicle();

	@Override
	public void addBody() {
		vehicle.addPart("This is a body of a Car");
	}

	@Override
	public void addWheels() {
		vehicle.addPart("4 wheels are added");
	}

	@Override
	public void addHeadlights() {
		vehicle.addPart("2 headlights are added");
	}

	@Override
	public Vehicle getVehicle() {
		return vehicle;
	}
}

class Motorcycle implements BuilderInterface {
	private Vehicle vehicle = new Vehicle();

	@Override
	public void addBody() {
		vehicle.addPart("This is a body of a Motorcycle");
	}

	@Override
	public void addWheels() {
		vehicle.addPart("2 wheels are added");
	}

	@Override
	public void addHeadlights() {
		vehicle.addPart("1 headlight is added");
	}

	@Override
	public Vehicle getVehicle() {
		return vehicle;
	}
}
