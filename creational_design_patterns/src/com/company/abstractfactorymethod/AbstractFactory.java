package com.company.abstractfactorymethod;

import java.awt.*;


public abstract class AbstractFactory {

	// this breaks the Integration Segregation Principle (used just for demonstrating purposes)

	abstract Color getColor(String color);
	abstract Shape getShape(String shapeType);
}

class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {

		if(color == null) {
			return null;
		} else if(color.equalsIgnoreCase("red")) {
			return new Red();
		}else if(color.equalsIgnoreCase("green")) {
			return new Green();
		}else if(color.equalsIgnoreCase("blue")) {
			return new Blue();
		}

		return null;
	}

	@Override
	Shape getShape(String shapeType) {
		return null;
	}
}

class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		return null;
	}

	@Override
	public Shape getShape(String shapeType) {

		if(shapeType == null) {
			return null;
		} else if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}

		return null;
	}
}
