package lsp.solution1;

public class Square extends Shape {
	private int side;
	
	public Square (int side) {
		this.side=side;
	}
	
	public int getSide() {
		return side;
	}
	
	@Override
	int calculateArea() {
		return side * side;
	}

}
