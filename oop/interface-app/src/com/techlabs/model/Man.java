package com.techlabs.model;

public class Man implements IMannerable {

	@Override
	public void wish() {
		System.out.println("Man wishes good afternoon");
	}

	@Override
	public void depart() {
		System.out.println("Man departs saying goodbye");
	}

}
