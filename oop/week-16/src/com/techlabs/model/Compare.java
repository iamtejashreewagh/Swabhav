package com.techlabs.model;

import java.util.Comparator;

public class Compare implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		String student1=s1.getRollNo()+""+s1.getStandard();
		String student2=s2.getRollNo()+""+s2.getStandard();
		return student1.compareTo(student1);
	}
	

}
