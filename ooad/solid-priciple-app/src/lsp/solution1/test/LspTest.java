package lsp.solution1.test;

import lsp.solution1.Rectangle;
import lsp.violation.Square;

public class LspTest {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(20, 30);
		Square square = new Square(50);
		System.out.println("Area of rectangle is : " + rect.calculateArea());
		System.out.println("Area of square is : " + square.calculateArea());
	}

}
