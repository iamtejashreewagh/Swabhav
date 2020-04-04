package com.techlabs.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.techlabs.model.Account;

public class DeserializationTest {
	public static void main(String[] args) {

		String filename = "file.data";

		try {

			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			Account acc = (Account) in.readObject();

			in.close();
			file.close();

			System.out.println("acc object has been deserialized ");
			System.out.println("ID : " + acc.getId());
			System.out.println("Name : " + acc.getName());
			System.out.println("Balance : " + acc.getBalance());
		}

		catch (IOException ex) {
			System.out.println("IOException is been seen");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is been seen");
		}

	}

}
