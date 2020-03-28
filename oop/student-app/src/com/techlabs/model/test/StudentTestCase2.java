package com.techlabs.model.test;

import com.techlabs.model.Student;

public class StudentTestCase2 {
	public static void main(String[] args) {
	System.out.println("Test Case 2:");
	Student c1 = new Student(101, "abc");
	System.out.println(c1.getStudentCount());
	Student c2 = new Student(101, "xyz");
	System.out.println(c2.getStudentCount());
	Student c3 = new Student(101, "lmno", 8.0f);
	System.out.println(c3.getStudentCount());
	
	}

}
