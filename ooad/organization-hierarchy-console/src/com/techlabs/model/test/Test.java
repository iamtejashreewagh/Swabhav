package com.techlabs.model.test;

import java.text.ParseException;

import com.techlabs.model.Employee;
import com.techlabs.model.FileLoader;
import com.techlabs.model.OrgHierarchyBuilder;
import com.techlabs.model.UrlLoader;

public class Test {
	public static void main(String[] args) throws Exception {
		OrgHierarchyBuilder builder = new OrgHierarchyBuilder(new UrlLoader());
		Employee emp = builder.getPresident();
		System.out.println(emp.show(0));
		System.out.println("\n");
		System.out.println(emp.showXml(0));
	}
}
