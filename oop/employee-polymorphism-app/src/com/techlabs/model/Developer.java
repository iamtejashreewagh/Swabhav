package com.techlabs.model;

public class Developer extends Employee {
	private double pa = basic*0.4;
	private double bonus= basic*0.3;
	private double netSalary;
	
	public Developer(String name, int id, double basic, Gender gender) {
		super(name, id, basic, gender);
	}
	
	@Override
	public double calculateNetSalary(double basic) {
		netSalary= pa+bonus+(basic*12);
		return netSalary;
	}

}
