package com.techlabs.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.techlabs.model.Account;

public class SerializeAnArrayTest {
	public static void main(String[] args) {
		Account.setMinimumBalance(100);
		Account[] acc = new Account[3];
		acc[0] = new Account(101, "abc", 1000);
		acc[1] = new Account(102, "xyz", 7000);
		acc[2] = new Account(103, "pqr", 500);
		acc[0].deposit(2000);
		acc[1].withdraw(4000);
		acc[2].deposit(1500);
		
		String filename = "file.data";

		try {

			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream op = new ObjectOutputStream(file);
			for (Account a : acc) {
				op.writeObject(a);
			}
			op.close();
			file.close();

			System.out.println("Array of an objects has been serialized");

		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

	}
}


