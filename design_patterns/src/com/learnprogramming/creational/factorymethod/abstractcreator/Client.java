package com.learnprogramming.creational.factorymethod.abstractcreator;

public class Client {

	public static void main(String[] args) {

		// get an object o Circle and call its draw method
		Shape circle = new CircleFactory().getShape();
		circle.draw();

		// get an object o Rectangle and call its draw method
		Shape rectangle = new RectangleFactory().getShape();
		rectangle.draw();

		// get an object o Circle and call its draw method
		Shape square = new SquareFactory().getShape();
		square.draw();

	}

}
