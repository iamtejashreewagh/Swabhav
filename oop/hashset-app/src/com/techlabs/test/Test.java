package com.techlabs.test;

import java.util.HashSet;

import com.techlabs.model.LineItem;

public class Test {
	public static void main(String[] args) {
		case1();
		case2();
	}

	public static void case1() {
		HashSet<String> names = new HashSet<String>();
		names.add("Tejashree");
		names.add("Asmita");
		System.out.println(names.size());
	}

	public static void case2() {
		HashSet<LineItem> items = new HashSet<LineItem>();
		items.add(new LineItem(101, "book", 10, 500));
		items.add(new LineItem(101, "book", 10, 500));
		LineItem item3 = new LineItem(103, "pen", 5, 100);
		LineItem item4 = new LineItem(103, "pen", 5, 100);
		items.add(item3);
		items.add(item4);
		System.out.println(items.size());
		
	}
	
}
