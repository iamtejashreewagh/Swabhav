package com.techlabs.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProductsTest {

	public static void main(String[] args) {
		String[] dataArray = new String[10];
		String csvFile = "products_updated.csv";
		File file = new File(csvFile);
		try {
			Scanner scannedFile = new Scanner(file);
			scannedFile.next();
			while (scannedFile.hasNext()) {
				int i = 0;
				String data = scannedFile.next();
				dataArray[i] = data;
				System.out.println(dataArray[i]);
				i++;
			}
			
			displayPrice(file);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void displayPrice(File file) {
		System.out.println("\n");
		Scanner scanFile;
		try {
			scanFile = new Scanner(file);
			scanFile.next();
			while(scanFile.hasNext()) {
				String data=scanFile.next();
				String[] values= data.split(",");
				double price = Double.parseDouble(values[2]);
				double discount = Double.parseDouble(values[3]);
				price=price-(discount*100);
				values[2]= String.valueOf(price);
				System.out.println("PRICE OF "+ values[1] +" AFTER DISCOUNT "+ price);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

