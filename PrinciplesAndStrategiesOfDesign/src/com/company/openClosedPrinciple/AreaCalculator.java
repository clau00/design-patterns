package com.company.openClosedPrinciple;


public class AreaCalculator {

	// the open closed(open for new features / closed for modification) principle do not apply here,
	// because if we add a new shape, we must modify the AreaCalculator class, adding a new method for the calculation

	public double calculateRectangleArea(Rectangle rectangle) {
		return rectangle.length * rectangle.width;
	}

	public double calculateCircleArea(Circle circle) {
		return (22/7) * circle.radius * circle.radius;
	}
}

class Rectangle {

	// public only for demonstration purposes
	public double length;
	public double width;
}

class Circle {

	// public only for demonstration purposes
	public double radius;
}



