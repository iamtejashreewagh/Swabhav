package com.techlabs.model;

public class Customer {
	private String id;
	private static int nextId;
	private String name;
	private int orders;
	
	static {
		nextId = 1000;
	}
	

	public Customer(String name, int orders) {
		this.name=name;
		this.orders=orders;
		nextId++;
		id="C"+nextId;
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
	
	public int getOrders() {
		return orders;
	}

}
