package com.techlabs.test;

public class RunTimeExceptionStackTest {
	public static void main(String[] args) {
		try {
			m1();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("End of main");
	}
	
	public static void m1(){
		System.out.println("Inside m1");
		m2();
	}
	
	public static void m2() {
		System.out.println("Inside m2");
		m3();
	}
	
	public static void m3() {
		throw new RuntimeException("some fatal error in message");
	}
	


}
