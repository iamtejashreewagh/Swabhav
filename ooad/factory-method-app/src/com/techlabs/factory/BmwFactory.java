package com.techlabs.factory;

public class BmwFactory implements IAutoFactory{
	
	public static BmwFactory instance;
	
	private BmwFactory() {
		// TODO Auto-generated constructor stub
	}

	public static BmwFactory getInstance() {
		if (instance == null) {
			instance = new BmwFactory();
			return instance;
		}
		return instance;
	}

	@Override
	public IAuto make() {
		return new Bmw();
	}
	

}
