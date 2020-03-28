package com.techlabs.model.test;

import com.techlabs.model.Student;

public class StudentTestCase3 {
	public static void main(String[] args) {
	System.out.println("Test Case 3:");
	Student obj1 = new Student(101, "abc");
	Student obj2 = new Student(101, "xyz");
	Student obj3 = new Student(101, "lmno", 8.0f);
	System.out.println("Head count = "+Student.headCount());
	
	}

}
