package com.techlabs.model;

public class Manager extends Employee {
	
	private double netSalary;
	private double hra = basic*0.5;
	private double ta = basic*0.4;
	private double da = basic*0.3;

	public Manager(String name, int id, double basic, Gender gender) {
		super(name, id, basic, gender);
	}

	@Override
	public double calculateNetSalary(double basic) {
		netSalary= hra+ta+da+(basic*12);
		return netSalary;
	}
	

}
