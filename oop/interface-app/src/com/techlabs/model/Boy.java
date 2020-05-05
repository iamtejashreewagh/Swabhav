package com.techlabs.model;

public class Boy implements IMannerable, IEmotional {

	@Override
	public void cry() {
		System.out.println("Boy cries");
	}

	@Override
	public void laugh() {
		System.out.println("Boy laughs");
	}

	@Override
	public void wish() {
		System.out.println("Boy wishes Good afternoon");
	}

	@Override
	public void depart() {
		System.out.println("Boy departs saying Bye");
	}

}
