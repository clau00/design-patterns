package com.company.dependencyInjectionPrinciple;

public class Client {

	// internal reference to the service used by this client
	private ExampleService service;

	Client() {
		// use a specific implementation in the constructor instead of using dependency injection
		service = new ExampleService();
	}

	// method within this client to use the service
	public String greet() {
		return "Hello " + service.getName();
	}
}

class ExampleService {
	public String getName() {
		return "the Name";
	}
}
