package com.techlabs.model;

public class Customer {
	private String id;
	private static int count;
	private String name;
	private int orders;
	
	static {
		count = 1000;
	}
	

	public Customer(String name, int orders) {
		this.name=name;
		this.orders=orders;
		count++;
		id="C"+count;
		
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
