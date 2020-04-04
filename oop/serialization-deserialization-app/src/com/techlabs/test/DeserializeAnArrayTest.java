package com.techlabs.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.techlabs.model.Account;

public class DeserializeAnArrayTest {
	public static void main(String[] args) {
		Account[] acc = new Account[3];
		String filename = "file.data";

		try {

			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream ip = new ObjectInputStream(file);
			acc[0] = (Account) ip.readObject();
			acc[1] = (Account) ip.readObject();
			acc[2] = (Account) ip.readObject();
			ip.close();
			file.close();

			System.out.println("Object has been deserialized ");
			for (Account a : acc) {
				printInfo(a);

			}

		}

		catch(IOException ex) {
			System.out.println("IOException is found");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}

	}

	public static void printInfo(Account a) {
		System.out.println("Acc No. = " + a.getId());
		System.out.println("Name = " + a.getName());
		System.out.println("Balance = " + a.getBalance());
		System.out.println();
	}
}
