package com.company.interfaceSegregationPrinciple.Restaurant;

public interface RestaurantInterface {
	// this interface can accept 3 types of orders: online, by telephone and walk in
	// this breaks this principle and Single Responsibility Principle like in the below example,
	// the OnlineClient must implement all the methods, including the useless ones:
	// "order by telephone", "pay in person" and "walk in order"

	public void acceptOnlineOrder();
	public void takeTelephoneOrder();
	public void payOnline();
	public void walkInCustomerOrder();
	public void payInPerson();
}

class OnlineClientImpl implements RestaurantInterface {
	@Override
	public void acceptOnlineOrder() {
		// logic for placing online orders
	}

	@Override
	public void takeTelephoneOrder() {
		// not applicable for online order
		throw new UnsupportedOperationException();
	}

	@Override
	public void payOnline() {
		// logic for paying online
	}

	@Override
	public void walkInCustomerOrder() {
		// not applicable for online order
		throw new UnsupportedOperationException();
	}

	@Override
	public void payInPerson() {
		// not applicable for online order
		throw new UnsupportedOperationException();
	}
}
