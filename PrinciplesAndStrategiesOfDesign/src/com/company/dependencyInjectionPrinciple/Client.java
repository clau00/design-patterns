package com.company.dependencyInjectionPrinciple;

interface Service {
	void write();
}

class ServiceA implements Service {
	@Override
	public void write() {
		System.out.println("Hello World");
	}
}

public class Client {

	// internal reference to the service used by this client
	private Service service;

	Client() {
		// use a specific implementation in the constructor instead of using dependency injection
		service = new ServiceA();
	}

	Client(Service service) {
		// injects via the constructor
		this.service = service;
	}

	public void setService(Service service) {
		// injects via the setter
		this.service = service;
	}

	// method within this client to use the service
	public void greet() {
		service.write();
	}

	public static void main(String[] args) {
		Service service = new ServiceA(); // the injector
		Client client = new Client(service); // injects via the constructor
		client.setService(service); // injects via setter
		client.greet();
	}
}


