package com.techlabs.factory;

public class Bmw implements IAuto{

	@Override
	public void start() {
		System.out.println("Bmw started");
		
	}

	@Override
	public void stop() {
		System.out.println("Bmw stopped");
		
	}

}
