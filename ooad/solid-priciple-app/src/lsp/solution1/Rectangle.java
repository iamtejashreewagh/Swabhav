package lsp.solution1;

public class Rectangle extends Shape {
	protected int width;
	protected int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public int calculateArea() {
		return width * height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}

}
