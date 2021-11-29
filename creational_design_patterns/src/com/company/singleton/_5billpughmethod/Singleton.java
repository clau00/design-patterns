package com.company.singleton._5billpughmethod;

public class Singleton {

	// the Bill Pugh approach resolve the eager initialization drawback,
	// it initializes the Singleton when the client needs it

	// an instance attribute
	private int data = 0;

	// the constructor, must be defined as private
	private Singleton() {}

	private static class SingletonHelper {
		// nested class is referenced after getInstance() is called
		private static final Singleton uniqueInstance = new Singleton();
	}

	public static Singleton getInstance() {
		return SingletonHelper.uniqueInstance;
	}

	public void setData(int myData) {
		data = myData;
	}

	public int getData() {
		return data;
	}

}
