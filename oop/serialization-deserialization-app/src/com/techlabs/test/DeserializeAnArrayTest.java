package com.techlabs.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.techlabs.model.Account;

public class DeserializeAnArrayTest {
	public static void main(String[] args) {
		Account[] accounts = new Account[3];
		String filename = "file.data";

		try {

			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream ip = new ObjectInputStream(file);
			accounts = (Account[]) ip.readObject();

			ip.close();
			file.close();

			System.out.println("Object has been deserialized ");
			printInfo(accounts);

		}

		catch (IOException ex) {
			System.out.println("IOException is found");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}

	}

	public static void printInfo(Account a[]) {
		for (Account accounts : a) {
			System.out.println("Acc No. = " + accounts.getId());
			System.out.println("Name = " + accounts.getName());
			System.out.println("Balance = " + accounts.getBalance());
			System.out.println();
		}
	}
}
