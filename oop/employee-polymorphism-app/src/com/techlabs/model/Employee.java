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
	
	public String getRole(Employee e) {
		Class<? extends Employee> className = e.getClass();
		String string = className.toString();
		String[] role= string.split(" ");
		String[] role1 = role[1].split("@");
		//String[] role2 = role1[0].split(".");
		return role1[0];
	}

}
