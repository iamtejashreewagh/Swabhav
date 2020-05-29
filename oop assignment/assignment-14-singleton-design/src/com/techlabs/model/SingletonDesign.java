package com.techlabs.model;

public enum SingletonDesign {
	INSTANCE;
	public int value;

	public void show() {
		System.out.println(value);
	}

}
