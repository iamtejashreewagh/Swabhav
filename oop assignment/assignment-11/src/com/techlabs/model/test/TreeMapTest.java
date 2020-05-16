package com.techlabs.model.test;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {

		System.out.println("create");
		TreeMap<Integer, String> numbers = new TreeMap<Integer, String>();
		numbers.put(1, "One");
		numbers.put(2, "Two");
		numbers.put(3, "Three");
		numbers.put(4, "Four");
		numbers.put(5, "Five");
		numbers.put(6, "Six");
		numbers.put(7, "Seven");

		System.out.println("delete");
		numbers.remove(6);

		System.out.println("update");
		numbers.put(8, "Eight");

		System.out.println("read");
		Set set = numbers.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mapEntry = (Map.Entry) iterator.next();
			System.out.print("key: " + mapEntry.getKey() + " , Value: ");
			System.out.println(mapEntry.getValue());
		}

		System.out.println("search");
		int searchKeyValue = 3;
		Set setForSearch = numbers.entrySet();
		Iterator iteratorForSearch = setForSearch.iterator();
		while (iteratorForSearch.hasNext()) {
			Map.Entry mapEntry = (Map.Entry) iteratorForSearch.next();

			if ((int) mapEntry.getKey() == searchKeyValue) {
				System.out.println("Number" + searchKeyValue + " exists");
			}
		}

	}

}
