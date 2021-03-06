package com.techlabs.model;

import java.util.Comparator;

public class LineItem implements Comparable<LineItem> {
	private String item;
	private int id;
	private int price;
	private int quantity;

	public LineItem(int id, String item, int price, int quantity) {
		this.id = id;
		this.item = item;
		this.price = price;
		this.quantity = quantity;
	}
	
	public int getId() {
		return id;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getItem() {
		return item;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public int compareTo(LineItem o) {
		return 0;
	}
	
	

}
