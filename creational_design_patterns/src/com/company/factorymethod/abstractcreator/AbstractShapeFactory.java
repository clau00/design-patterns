package com.company.factorymethod.abstractcreator;

public abstract class AbstractShapeFactory {

	// this is the most "STRICT" implementation of the Factory Method

	protected abstract Shape factoryMethod();

	public Shape getShape() {
		return factoryMethod();
	}
}

class RectangleFactory extends AbstractShapeFactory {

	@Override
	protected Shape factoryMethod() {
		return new Rectangle();
	}
}

class SquareFactory extends AbstractShapeFactory {

	@Override
	protected Shape factoryMethod() {
		return new Square();
	}
}

class CircleFactory extends AbstractShapeFactory {

	@Override
	protected Shape factoryMethod() {
		return new Circle();
	}
}
