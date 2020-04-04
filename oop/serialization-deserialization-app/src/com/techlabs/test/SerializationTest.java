package com.techlabs.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.techlabs.model.Account;

public class SerializationTest {
	public static void main(String[] args) {
		Account.setMinimumBalance(500);
		Account acc = new Account(101, "abc", 5000);
		acc.deposit(2000);
		String filename = "file.data";

		try {

			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(acc);

			out.close();
			file.close();

			System.out.println("acc object has been serialized");

		}

		catch (IOException ex) {
			System.out.println("IOException is been seen");
		}

	}

}
