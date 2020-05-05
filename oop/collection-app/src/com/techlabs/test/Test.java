package com.techlabs.test;

import java.util.ArrayList;
import java.util.Iterator;

import com.techlabs.model.LineItem;

public class Test {
	public static void main(String[] args) {
		case1();
		case2();
	}

	public static void case1() {
		int totalCost = 0;
		ArrayList cart = new ArrayList();
		cart.add(new LineItem(101, "book", 10, 500));
		cart.add(new LineItem(102, "pen", 5, 50));
		cart.add(new LineItem(103, "pencil", 3, 10));
		cart.add("Swabhav");
		for (Object items : cart) {
			try {
				LineItem item = (LineItem) items;
				totalCost = (item.getPrice() * item.getQuantity()) + totalCost;
			} catch (Exception ex) {
			}
		}
		System.out.println("case1:");
		System.out.println("Total cost of the cart is " + totalCost);
	}

	public static void case2() {
		int totalCost = 0;
		ArrayList<LineItem> cart = new ArrayList();
		cart.add(new LineItem(101, "book", 10, 500));
		cart.add(new LineItem(102, "pen", 5, 50));
		cart.add(new LineItem(103, "pencil", 3, 10));
		for (LineItem item : cart) {
			totalCost = (item.getPrice() * item.getQuantity()) + totalCost;
		}
		System.out.println("case2:");
		System.out.println("Total cost of the cart is " + totalCost);
	}

}
