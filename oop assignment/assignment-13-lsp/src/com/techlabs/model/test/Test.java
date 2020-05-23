package com.techlabs.model.test;

import com.techlabs.model.Rectangle;
import com.techlabs.model.Square;

public class Test {
	public static void main(String[] args) {
		Square square = new Square(10);
		System.out.println("Perimeter of Square : " + square.getPerimeter());

		Rectangle rectangle = new Rectangle(20, 10);
		System.out.println("Perimeter of Rectangle : " + rectangle.getPerimeter());

	}
}
