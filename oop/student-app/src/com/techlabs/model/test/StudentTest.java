package com.techlabs.model.test;

import com.techlabs.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		 Student s1 = new Student(101, "abc");
		 System.out.println(s1.getStudentCount());
		 Student s2 = new Student(101, "xyz");
		 System.out.println(s2.getStudentCount());
		 Student s3 = new Student(101, "lmno", 8.0f);
		 System.out.println(s3.getStudentCount());
		 
		 
	}

}
