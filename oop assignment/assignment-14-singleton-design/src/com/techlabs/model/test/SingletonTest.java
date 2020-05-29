package com.techlabs.model.test;

import com.techlabs.model.SingletonDesign;

public class SingletonTest {
	public static void main(String[] args) {
		SingletonDesign obj1 = SingletonDesign.INSTANCE;
		obj1.value = 100;
		obj1.show();

		SingletonDesign obj2 = SingletonDesign.INSTANCE;
		obj2.value = 300;
		obj1.show();
	}

}
