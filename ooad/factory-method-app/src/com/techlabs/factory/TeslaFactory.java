package com.techlabs.factory;

public class TeslaFactory implements IAutoFactory{
	
public static TeslaFactory instance;
	
	private TeslaFactory() {
		// TODO Auto-generated constructor stub
	}

	public static TeslaFactory getInstance() {
		if (instance == null) {
			instance = new TeslaFactory();
			return instance;
		}
		return instance;
	}

	@Override
	public IAuto make() {
		return new Tesla();
	}

}
