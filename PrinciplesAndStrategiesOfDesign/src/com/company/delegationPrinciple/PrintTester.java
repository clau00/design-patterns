package com.company.delegationPrinciple;

class RealPrinter {
	// the "delegate"

	void print() {
		System.out.println("The Delegate (RealPrinter)");
	}
}

class Printer {
	// the "delegator"

	// create the delegate
	RealPrinter realPrinter = new RealPrinter();

	// use the delegate
	void print() {
		realPrinter.print();
	}
}

public class PrintTester {
	// to the outside world it looks like the Printer actually prints

	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.print();
	}
}
