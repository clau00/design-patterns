package com.company.builder.challenge;

public interface PackingInterface {
	public String pack();
}

class Wrapper implements PackingInterface {
	@Override
	public String pack() {
		return this.getClass().getSimpleName();
	}
}

class Bottle implements PackingInterface {
	@Override
	public String pack() {
		return this.getClass().getSimpleName();
	}
}

