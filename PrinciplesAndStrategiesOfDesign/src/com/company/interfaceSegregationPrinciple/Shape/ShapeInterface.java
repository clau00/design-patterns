package com.company.interfaceSegregationPrinciple.Shape;

public interface ShapeInterface {

	// this example violates the principle because forces all the shapes that implements it to override both methods
	// so, the squares are forced to have a "volume()" method, but they do not have such property

	public double area();
	// public double volume();
}

interface SolidShapeInterface {

	// as a solution, we created another interface containing the volume() method for the solid shapes
	// now, each interface has a specific functionality
	public double volume();

	// now, we have shapes implementing the 1st, the 2nd, or both interfaces.
	// the clients should know the methods to call for each shape, so,
	// we implement another shape with "calculate()" method
}

interface ManageShapeInterface {
	public double calculate();
}

class Square implements ShapeInterface, ManageShapeInterface {

	@Override
	public double area() {
		return 0;
	}

	@Override
	public double calculate() {
		return area();
	}
}

class Cube implements ShapeInterface, SolidShapeInterface, ManageShapeInterface {

	@Override
	public double area() {
		return 0;
	}

	@Override
	public double volume() {
		return 0;
	}

	@Override
	public double calculate() {
		return area() + volume();
	}
}
