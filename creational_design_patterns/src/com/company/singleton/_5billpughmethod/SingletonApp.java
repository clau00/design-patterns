package com.company.singleton._5billpughmethod;

public class SingletonApp {

	public static void main(String[] args) {

		Singleton s = Singleton.getInstance();
		s.setData(55);

		System.out.println("\nFirst reference: " + s);
		System.out.println("Singleton data value is: " + s.getData());

		s = null;
		s = Singleton.getInstance();

		System.out.println("\nSecond reference: " + s);
		System.out.println("Singleton data value is: " + s.getData());
	}

}