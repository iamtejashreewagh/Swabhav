package com.techlabs.basic;

public class BoxingExampleTest {
	public static void main(String[] args) {
		int i1=1;
		int i2=1;
		System.out.println("i1==i2:" + (i1==i2));
		
		Integer num1=1;
		int num2=1;
		System.out.println("num1==num2: "+(num1==num2));
		
		Integer one=new Integer(1);
		Integer anotherOne=new Integer(1);
		System.out.println("one==anotherOne: "+ (one==anotherOne));
	}

}
