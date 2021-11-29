package com.company.singleton.synchronizedmethod;

public class Singleton {

	// by adding the synchronized keyword to getInstance(),
	// we force every thread to wait its turn before it can enter the method

	// PROBLEM: bottleneck, all the threads will wait for the check on whether the object already exists
	// we only need to synchronize this the first time (until the instance is created)

	// the private static reference to the one and only instance
	private static Singleton uniqueInstance = null;

	// an instance attribute
	private int data = 0;

	// the constructor, must be defined as private
	private Singleton() {}

	public static synchronized Singleton getInstance() {
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
