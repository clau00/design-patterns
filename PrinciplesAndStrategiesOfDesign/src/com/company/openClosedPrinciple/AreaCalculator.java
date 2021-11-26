package com.company.openClosedPrinciple;

public class AreaCalculator {

	// the open closed(open for new features / closed for modification) principle do not apply here,
	// because if we add a new shape, we must modify the AreaCalculator class, adding a new method for the calculation

//	public double calculateRectangleArea(Rectangle rectangle) {
//		return rectangle.length * rectangle.width;
//	}
//
//	public double calculateCircleArea(Circle circle) {
//		return (22/7) * circle.radius * circle.radius;
//	}

	// we refactor this adding a Shape interface, containing the calculateArea method
	// all the old and new shapes will implement this interface and override the method
	// commented the above methods and made a new one using the Shape interface

	// now, we can easily extend the functionality, by adding new shapes and
	// we no longer have to modify this class(AreaCalculator)

	public double calculateShapeArea(Shape shape) {
		return shape.calculateArea();
	}
}

interface Shape {
	public double calculateArea();
}

class Rectangle implements Shape {

	// public only for demonstration purposes
	public double length;
	public double width;

	public double calculateArea() {
		return length * width;
	}
}

class Circle implements Shape{

	// public only for demonstration purposes
	public double radius;

	public double calculateArea() {
		return (22/7) * radius * radius;
	}
}



