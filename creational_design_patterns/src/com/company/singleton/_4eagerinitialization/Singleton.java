package com.company.singleton._4eagerinitialization;

public class Singleton {

	// the Singleton instance will be created at time of class loading
	// this is thread safe
	// DRAWBACK: the instance is created even though the client might not be using it

	// the private static reference to the one and only instance
	private static Singleton uniqueInstance = new Singleton();

	// an instance attribute
	private int data = 0;

	// the constructor, must be defined as private
	private Singleton() {}

	public static Singleton getInstance() {
		return uniqueInstance;
	}

	public void setData(int myData) {
		data = myData;
	}

	public int getData() {
		return data;
	}

}
