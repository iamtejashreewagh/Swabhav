package com.techlabs.model;

public class ClassA {
	private IFooableInterface c = new ClassB();
	
	public ClassA(ClassB b) {
		this.c = b;
	}

	public void bar() {
		c.bar();
	}

}
