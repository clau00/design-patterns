package com.learnprogramming.creational.builder.challenge;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<ItemInterface> items;

	public Meal() {
		items = new ArrayList<>();
	}

	public void addItem(ItemInterface item) {
		items.add(item);
	}

	public double getCost() {
		double cost = 0;

		for(ItemInterface item : items) {
			cost += item.getPrice();
		}

		return cost;
	}

	public void showItems() {
		for(ItemInterface item : items) {
			System.out.print("Item: ");
			System.out.print(item.getName() + ", Packing: " + item.getPacking().pack() + ", Price: " + item.getPrice() + "\n");
		}
		System.out.println("Total Cost: " + getCost() + "\n");
	}
}
