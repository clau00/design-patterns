package com.company.singleton._3doublecheckedlocking;

public class Singleton {

	// used volatile keyword (ensures that multiple threads handle the uniqueInstance correctly
	// when it is being initialized)  on the static variable and
	// synchronized the first time through when we want to create the singleton

	// the private static reference to the one and only instance
	private volatile static Singleton uniqueInstance = null;

	// an instance attribute
	private int data = 0;

	// the constructor, must be defined as private
	private Singleton() {}

	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			synchronized (Singleton.class) { // we only synchronize the first time through
				if(uniqueInstance == null){
					uniqueInstance = new Singleton();
				}
			}
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
