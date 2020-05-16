package com.techlabs.model.test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.techlabs.model.Compare;
import com.techlabs.model.Student;

public class Test{
	public static void main(String[] args) {
		Student s1=new Student(1, 10, "ABC", 8.0f);
		Student s2=new Student(1, 10, "xyz", 7.5f);
		Map<Student, Student> map;
		map = new TreeMap<Student, Student>(new Compare());
		map.put(s1, s1);
		map.put(s2, s2);
		
		System.out.println(map.size());

	}
}
