package com.techlabs.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortArrayList {
	public static void main(String args[]) {
		Map<String, Employee> map = new HashMap<>();
		Employee emp1= new Employee(1, "ONE");
		map.put(emp1.getName(), emp1);
		Employee emp2= new Employee(2, "TWO");
		map.put(emp2.getName(), emp2);
		Employee emp3= new Employee(3, "THREE");
		map.put(emp3.getName(), emp1);
		Employee emp4= new Employee(4, "FOUR");
		map.put(emp4.getName(), emp1);
		Employee emp5= new Employee(5, "FIVE");
		map.put(emp5.getName(), emp1);
		
		//SortedSet<String> keySet= new TreeSet<>(map.keySet());
		List<String> employeeByKey=new ArrayList<>(map.keySet());
		//List<Employee> employeeByValue=new ArrayList<>(map.values());
		Collections.sort(employeeByKey);
		
		Set set = map.entrySet();
		Iterator i =  set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}
}
