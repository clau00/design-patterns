package com.learnprogramming.creational.builder;

import java.util.LinkedList;

public class Vehicle {
	private LinkedList<String> parts;

	public Vehicle() {
		parts = new LinkedList<>();
	}

	public void addPart(String part) {
		parts.addLast(part);
	}

	public void showParts() {
		System.out.println("\n Vehicle completed as below:");

		for(String part : parts) {
			System.out.println(part);
		}
	}
}
