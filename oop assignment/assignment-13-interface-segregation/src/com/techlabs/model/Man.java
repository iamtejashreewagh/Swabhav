package com.techlabs.model;

public class Man implements IRunnable{

	@Override
	public void move() {
		System.out.println("Man is moving");
	}

	@Override
	public void run() {
		System.out.println("Man is running");
		
	}
	

}
