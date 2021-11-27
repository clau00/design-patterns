package com.company.interfaceSegregationPrinciple;

public interface ShapeInterface {

	// this example violates the principle because forces all the shapes that implements it to override both methods
	// so, the squares are forced to have a "volume()" method, but they do not have such property

	public double area();
	// public double volume();
}

interface SolidShapeInterface {

	// as a solution, we create 2 interfaces, each one with its specific functionality
	public double volume();
}

class Square implements ShapeInterface {

	@Override
	public double area() {
		return 0;
	}
}

class Cube implements ShapeInterface, SolidShapeInterface {

	@Override
	public double area() {
		return 0;
	}

	@Override
	public double volume() {
		return 0;
	}
}
