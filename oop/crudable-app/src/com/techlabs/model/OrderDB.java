package com.techlabs.model;

public class OrderDB implements ICrudable {

	@Override
	public void create() {
		System.out.println("Order created");
	}

	@Override
	public void read() {
		System.out.println("Reading order");
	}

	@Override
	public void update() {
		System.out.println("Updating order");
	}

	@Override
	public void delete() {
		System.out.println("Deleting order");
	}

}
