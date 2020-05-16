package com.techlabs.model.test;

import java.util.Collection;
import java.util.Map;

import com.techlabs.model.EmployeeDataAnalyzer;
import com.techlabs.model.CsvFileLoader;
import com.techlabs.model.Employee;

public class Test {
	public static void main(String[] args) throws Exception {
		EmployeeDataAnalyzer database1 = new EmployeeDataAnalyzer(new CsvFileLoader());
		Collection<Employee> employees = database1.getEmployees();
		for (Employee employee : employees) {
			printInfo(employee);
		} 
		
		System.out.println("\nHighest salaried Employee");
		printInfo(database1.getMaxSalriedEmployee(employees));

		Map<String, Integer> group = database1.getDesignationwiseEmps();
		System.out.println(group);
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
	
	private static void displayCount(Collection<Employee> employees) {
		String manager = "Manager", clerk = "Clerk", president = "President", salesMan = "Salesman", analyst = "Analyst";
		int managerCount = 0, clerkCount = 0, presidentCount = 0, salesManCount = 0, analystCount = 0, deptId10 = 10, deptId20 = 20, deptId30 = 30, deptId1Count = 0, deptId2Count = 0, deptId3Count = 0;
		for (Employee employee : employees) {
			if (manager.equalsIgnoreCase(employee.getRole())) {
				managerCount++;
			}
			if (clerk.equalsIgnoreCase(employee.getRole())) {
				clerkCount++;
			}
			if (president.equalsIgnoreCase(employee.getRole())) {
				presidentCount++;
			}
			if (salesMan.equalsIgnoreCase(employee.getRole())) {
				salesManCount++;
			}
			if (analyst.equalsIgnoreCase(employee.getRole())) {
				analystCount++;
			}
			if (deptId10 == employee.getDeptId()) {
				deptId1Count++;
			}
			if (deptId20 == employee.getDeptId()) {
				deptId2Count++;
			}
			if (deptId30 == employee.getDeptId()) {
				deptId3Count++;
			}
		}
		System.out.println("\nTotalCount of : \nManager:" + managerCount + "\nClerk:"
				+ clerkCount + "\nPresident:" + presidentCount + "\nSalesman:"
				+ salesManCount + "\nAnalyst:" + analystCount);
		System.out.println("\nTotal Count On DeptNo\nDeptNo:1 has "
				+ deptId1Count + "\nDeptNo:2 has " + deptId2Count
				+ "\nDeptNo:3 has " + deptId3Count);
	}

}