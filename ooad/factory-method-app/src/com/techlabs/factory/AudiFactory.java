package com.techlabs.factory;

public class AudiFactory implements IAutoFactory {

	public static AudiFactory instance;

	private AudiFactory() {
		// TODO Auto-generated constructor stub
	}

	public static AudiFactory getInstance() {
		if (instance == null) {
			instance = new AudiFactory();
			return instance;
		}
		return instance;
	}

	@Override
	public IAuto make() {
		return new Audi();
	}

}
