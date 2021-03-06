package com.techlabs.model;

public class Square extends Shape {

	private int side;

	public Square(int side) {
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	@Override
	public int getPerimeter() {
		return 4*side;
	}

}

