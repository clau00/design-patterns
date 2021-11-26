package com.company.liskovSubstitutionPrinciple;

public class Vehicle {

	int getSpeed() {
		return 0;
	};
	int getCubicCapacity() {
		return 10;
	};

	public static void main(String[] args) {

		Vehicle vehicle = new Bus();
		System.out.println(vehicle.getSpeed());

		vehicle = new Car();
		System.out.println(vehicle.getCubicCapacity());
	}
}

class Car extends Vehicle {

	int getSpeed() {
		return 1;
	}

	int getCubicCapacity() {
		return 11;
	}

	boolean isHatchBack() {
		return false;
	}

}

class Bus extends Vehicle {

	int getSpeed() {
		return 2;
	}

	int getCubicCapacity() {
		return 22;
	}

	String getEmergencyExitLocation() {
		return "Go there!";
	}
}
