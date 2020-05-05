package com.techlabs.model.test;

import java.text.ParseException;
import java.util.Collection;

import com.techlabs.model.DataBaseLoader;
import com.techlabs.model.Employee;

public class Test {
	public static void main(String[] args) throws ParseException {
		DataBaseLoader databaseObject = new DataBaseLoader();
		databaseObject.loadData();
		Collection<Employee> employees = databaseObject.getEmployees();
		for (Employee employee : employees) {
			printInfo(employee);
		}
	}

	private static void printInfo(Employee employee) {
		System.out.print("Emp Id:" + employee.getEmployeeId());
		System.out.print(" Name:" + employee.getEmployeeName());
		System.out.print(" Role:" + employee.getRole());
		System.out.print(" ManagerId:" + employee.getManagerId());
		System.out.print(" Joining Date:" + employee.getJoiningDate());
		System.out.print(" Salary:" + employee.getSalary());
		System.out.print(" Comm:" + employee.getComm());
		System.out.println(" Dept Id:" + employee.getDeptId());
	}
}
