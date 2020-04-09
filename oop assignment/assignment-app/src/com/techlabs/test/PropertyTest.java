package com.techlabs.test;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertyTest {
	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("url.properties");

		Properties property = new Properties();
		property.load(reader);
		System.out.println("Case 1 : Read file");
		System.out.println("URL : " + property.getProperty("url"));
		System.out.println("User Name: " + property.getProperty("name"));
		System.out.println("User ID : " + property.getProperty("id"));
		

		System.out.println("\nCase 2 : Read file using iterator");
		readUsingIterator(property);
		
		System.out.println("\nCase 3 : Read file using Enhanced for loop ");
		Set<String> keys= property.stringPropertyNames();
		readUsingForEach(property, keys);

	}
	
	public static void readUsingIterator(Properties property) {
		//Properties property = System.getProperties();
		Set set = property.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
	}
	
	public static void readUsingForEach(Properties property, Set<String> keys) {
		for (String key : keys) {
			System.out.println(key + "=" + property.getProperty(key));
		}
	}
}
