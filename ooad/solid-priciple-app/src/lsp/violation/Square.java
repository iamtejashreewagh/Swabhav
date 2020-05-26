package lsp.violation;

public class Square extends Rectangle {
	private int side;

	public Square(int side) {
		super(side, side);
	}

	public int getSide() {
		return side;
	}

	@Override
	public void setWidth(int width) {
		this.width = height = width;
	}
	
	@Override
	public void setHeight(int height) {
		width = this.height = height;
	}

}
