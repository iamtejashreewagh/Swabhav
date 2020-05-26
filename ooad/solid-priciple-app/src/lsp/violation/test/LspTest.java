package lsp.violation.test;

import lsp.violation.Rectangle;
import lsp.violation.Square;

public class LspTest {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(10, 20);
		Rectangle square = new Square(10);

		System.out.println("Area of rectangle : " + rect.calculateArea());
		System.out.println("Area of Square : " + square.calculateArea());
		shouldNotChangeWidth_IfHeightIsModified(rect);
		shouldNotChangeWidth_IfHeightIsModified(new Square(50));

	}

	public static void shouldNotChangeWidth_IfHeightIsModified(Rectangle rect) {
		int beforeWidth = rect.getWidth();
		rect.setHeight(rect.getHeight() + 10);
		int afterWidth = rect.getWidth();
		System.out.println(beforeWidth == afterWidth);

	}

}
