package com.techlabs.model.test;

import com.techlabs.model.ClassA;
import com.techlabs.model.ClassB;

public class DEcouplingTest {
	public static void main(String[] args) {
		ClassB b = new ClassB();
		ClassA a = new ClassA(b);
		a.bar();

	}
}
