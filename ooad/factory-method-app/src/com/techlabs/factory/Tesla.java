package com.techlabs.factory;

public class Tesla implements IAuto{

	@Override
	public void start() {
		System.out.println("Tesla started");
		
	}

	@Override
	public void stop() {
		System.out.println("Tesla is stopped");
		
	}

}
