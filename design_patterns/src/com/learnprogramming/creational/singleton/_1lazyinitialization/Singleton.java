package com.learnprogramming.creational.singleton._1lazyinitialization;

public class Singleton {

	// lazy implementation means we will not create it unless we will need it (calling getInstance())
	// PROBLEM(when the singleton has state - other fields): is not thread safe!!!

	// the private static reference to the one and only instance
	private static Singleton uniqueInstance = null;

	// an instance attribute
	private int data = 0;

	// the constructor, must be defined as private
	private Singleton() {}

	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}

		return uniqueInstance;
	}

	public void setData(int myData) {
		data = myData;
	}

	public int getData() {
		return data;
	}

}
