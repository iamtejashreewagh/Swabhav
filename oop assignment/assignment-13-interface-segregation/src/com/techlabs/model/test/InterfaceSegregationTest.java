package com.techlabs.model.test;

import com.techlabs.model.IHuman;
import com.techlabs.model.IRunnable;
import com.techlabs.model.Man;

public class InterfaceSegregationTest {
	public static void main(String[] args) {
		IRunnable man = new Man();
		man.move();
		man.run();

	}
}
