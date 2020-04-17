package com.techlabs.test;

import com.techlabs.model.Analyst;
import com.techlabs.model.Developer;
import com.techlabs.model.Employee;
import com.techlabs.model.Gender;
import com.techlabs.model.Manager;

public abstract class Test {
	public static void main(String[] args) {
		Manager m1=new Manager("abc", 101, 50000, Gender.MALE);
		printSalarySlip(m1);
		
		Developer d1=new Developer("xyz", 201, 50000, Gender.FEMALE);
		printSalarySlip(d1);
		
		Analyst a1= new Analyst("pqr",301, 50000, Gender.FEMALE);
		printSalarySlip(a1);
	}
	
	public static void printSalarySlip(Employee e){
		System.out.println(e.calculateNetSalary(50000));
	}

}
