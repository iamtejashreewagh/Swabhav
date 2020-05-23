package com.techlabs.model.test;

import com.techlabs.model.NetOrder;
import com.techlabs.model.OrderProcessTemplate;
import com.techlabs.model.StoreOrder;

public class Test {
	public static void main(String[] args) {
		OrderProcessTemplate netOrder = new NetOrder();
		netOrder.processOrder(true);
		System.out.println();
		OrderProcessTemplate storeOrder = new StoreOrder();
		storeOrder.processOrder(true);
	}

}
