package com.techlabs.model;

public class Student {
	private int rollNo;
	private int standard;
	private String name;
	private float cgpa;
	
	public Student(int rollNo, int standard, String name, float cgpa) {
		this.rollNo=rollNo;
		this.standard=standard;
		this.name=name;
		this.cgpa=cgpa;
	}
	
	@Override
	public boolean equals(Object s2) {
		Student s1 = (Student) s2;
		if(this.hashCode()==s2.hashCode())
			return true;
		return false;
		
	}
	
	@Override
	public int hashCode() {
	   String combine = rollNo+""+standard;
	   int compositePrimaryKey = Integer.parseInt(combine);
	   return compositePrimaryKey;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public int getStandard() {
		return standard;
	}


}
