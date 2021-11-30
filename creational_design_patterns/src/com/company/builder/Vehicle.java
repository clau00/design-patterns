package com.company.builder;

import java.util.LinkedList;
import java.util.List;

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
