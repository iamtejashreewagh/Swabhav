package com.techlabs.model;

public class Analyst extends Employee{
	private double netSalary;
	private double perks=basic*0.3;

	public Analyst(String name, int id, double basic, Gender gender) {
		super(name, id, basic, gender);
	}

	@Override
	public double calculateNetSalary(double basic) {
		netSalary=perks+(basic*12);
		return netSalary;
	}
	

}
