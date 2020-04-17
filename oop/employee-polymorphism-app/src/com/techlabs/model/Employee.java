package com.techlabs.model;

public abstract class Employee {
	private String name;
	private int id;
	protected double basic;
	private Gender gender;
	
	public Employee(String name, int id, double basic, Gender gender) {
		this.id=id;
		this.name=name;
		this.basic=basic;
	}
	
	public abstract double calculateNetSalary(double basic);
	
	public String getName() {
		return name;
	}

}
