package com.techlabs.model;

public class CustomerDB implements ICrudable {

	public void create() {
		System.out.println("Customer created");
	}

	public void read() {
		System.out.println("Reading Customer");
	}

	public void update() {
		System.out.println("Updating Customer");
	}

	public void delete() {
		System.out.println("Deleting Customer");
	}
	

}
