package com.techlabs.model;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class OrgHierarchyBuilder {
	Map<Integer, Employee> employees = new TreeMap<Integer, Employee>();

	public OrgHierarchyBuilder(ILoader file) throws Exception {
		List<String> list = file.getData();
		for (String data : list) {
			String[] components = data.split(",");
			int empId = Integer.parseInt(components[0]);
			String empName = components[1].replaceAll("'", "");
			String role = components[2].replaceAll("'", "");
			int managerId = 0;
			if (!components[3].equals("NULL")) {
				managerId = Integer.parseInt(components[3]);
			}

			String joinDate = components[4].replaceAll("'", "");
			int salary = Integer.parseInt(components[5]);
			int comm = 0;
			if (!components[6].equals("NULL")) {
				comm = Integer.parseInt(components[6]);
			}

			int dptId = Integer.parseInt(components[7]);
			employees.put(empId, new Employee(empId, empName, role, managerId, joinDate, salary, comm, dptId));
		}
		for (Map.Entry employee : employees.entrySet()) {
			findEmployee((Employee) employee.getValue());
		}
	}

	public Map<Integer, Employee> getEmployees() {
		return employees;
	}

	public Employee getPresident() {
		for (Map.Entry employee : employees.entrySet()) {
			Employee president = (Employee) employee.getValue();
			if (president.getDesignation().contains("PRESIDENT")) {
				return president;
			}
		}
		return null;
	}

	private void findEmployee(Employee emp) {
		Employee emp1 = emp;
		Employee emp2 = employees.get(emp1.getManagerId());
		if (emp2 != null && emp1 != null) {
			emp2.addReferralEmployee(emp1);
		}
	}

}
