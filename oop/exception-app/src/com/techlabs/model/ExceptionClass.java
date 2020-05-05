package com.techlabs.model;

public class ExceptionClass {
	public void m1() throws MyCheckedException {
		System.out.println("m1");
	}
	
	public void m2() throws MyUncheckedException{
		System.out.println("m2");
	}

}
