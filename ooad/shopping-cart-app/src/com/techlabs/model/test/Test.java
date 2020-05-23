package com.techlabs.model.test;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;

import com.techlabs.model.Customer;
import com.techlabs.model.LineItem;
import com.techlabs.model.Order;
import com.techlabs.model.Product;

public class Test {
	public static void main(String[] args) throws ParseException, IOException {
		Customer kishore = new Customer(101, "kishore", "thane");
		Customer vishal = new Customer(102, "vishal", "bhandup");

		System.out.println("#Task1");
		Product book = new Product(1, "book", 80, 50);
		Product pen = new Product(2, "pen", 10, 50);
		Product ruler = new Product(3, "ruler", 16, 25);
		Product bag = new Product(11, "bag", 4000, 25);
		Product mobile = new Product(12, "mobile", 40000, 10);
		LineItem bookItem = new LineItem(201, 12, book);
		LineItem penItem = new LineItem(202, 10, pen);
		LineItem rulerItem = new LineItem(203, 5, ruler);
		LineItem bagItem = new LineItem(301, 2, bag);
		LineItem mobileItem = new LineItem(302, 1, mobile);

		Order order1 = new Order(1, "15/05/2020");
		order1.addItem(bookItem);
		order1.addItem(penItem);
		order1.addItem(rulerItem);

		Order order2 = new Order(2, "16/05/2020");
		order2.addItem(bagItem);
		order2.addItem(mobileItem);

		kishore.addOrder(order1);
		kishore.addOrder(order2);

		printInfo(kishore);
		csvFileWriter(kishore);

	}

	private static void printInfo(Customer customer) {
		double totalCost = 0;
		System.out.println("Customer details : ");
		System.out.println("Customer ID : " + customer.getId() + "\nCustomer name : " + customer.getName()
				+ "\nCustomer Address : " + customer.getAddress());
		System.out.println("\nOrder details : ");
		List<Order> orders = customer.getOrders();
		for (Order order : orders) {
			System.out.println("Order id : " + order.getId());
			System.out.println("Order date : " + order.getDate());
			System.out.println("Line item details : ");
			List<LineItem> items = order.getItems();
			for (LineItem item : items) {
				System.out.println("Line item id : " + item.getId() + "\nLineItem product : "
						+ item.getProduct().getName() + "\nProduct quantity : " + item.getQuantity()
						+ "\nLine item cost : " + item.calculateItemCost());
				System.out.println("Order total : " + order.checkoutCost());
			}
			totalCost = totalCost + order.checkoutCost();
			System.out.println("\n");
		}
		System.out.println("Cart total is : " + totalCost);

	}

	private static void csvFileWriter(Customer customer) throws IOException {
		FileWriter writer = new FileWriter("cartDetails.csv");
		double totalCost = 0;
		writer.write(" ID : " + customer.getId() + ", Name : " + customer.getName()
				+ " Address : " + customer.getAddress());
		writer.write("\nOrder details : ");
		for (Order order : customer.getOrders()) {
			writer.write("  id : " + order.getId() + ", date : " + order.getDate());
			writer.write("\nLine item details : ");
			List<LineItem> items = order.getItems();
			for (LineItem item : items) {
				writer.write(" id : " + item.getId() + ", product : "
						+ item.getProduct().getName() + ", quantity : " + item.getQuantity()
						+ ", cost : " + item.calculateItemCost());
				System.out.println("\nOrder total : " + order.checkoutCost());
			}
			totalCost = totalCost + order.checkoutCost();
			System.out.println("\n");
		}
		
		writer.write("Cart Total : " + totalCost);
		writer.close();
		System.out.println("File writed ");
	}

}
