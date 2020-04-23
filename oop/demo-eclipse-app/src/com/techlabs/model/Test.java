package com.techlabs.model;

public class Test {
	public static void main(String[] args) {
		OddEven test = new OddEven();
		System.out.println(test.getEvenNumbers(0, 6)[0]);
		System.out.println(test.getEvenNumbers(0, 100).length);
		
	}

}
