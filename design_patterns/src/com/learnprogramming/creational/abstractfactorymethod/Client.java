package com.learnprogramming.creational.abstractfactorymethod;

public class Client {

	public static void main(String[] args) {
		// get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		// get an object of Shape Circle from ShapeFactory and call draw() method
		Shape circle = shapeFactory.getShape("circle");
		circle.draw();

		// get an object of Shape Rectangle from ShapeFactory and call draw() method
		Shape rectangle = shapeFactory.getShape("rectangle");
		rectangle.draw();

		// get an object of Shape Square from ShapeFactory and call draw() method
		Shape square = shapeFactory.getShape("square");
		square.draw();

		// get color factory
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");

		// get an object of Color Red from ShapeFactory and call fill() method
		Color red = colorFactory.getColor("red");
		red.fill();

		// get an object of Color Green from ShapeFactory and call fill() method
		Color green = colorFactory.getColor("green");
		green.fill();

		// get an object of Color Blue from ShapeFactory and call fill() method
		Color blue = colorFactory.getColor("blue");
		blue.fill();
	}

}
