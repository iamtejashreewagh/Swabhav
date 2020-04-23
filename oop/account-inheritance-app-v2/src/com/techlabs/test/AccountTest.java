package com.techlabs.test;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;

import com.techlabs.model.Account;
import com.techlabs.model.CurrentAccount;

public class AccountTest {
	public static void main(String[] args) throws ParseException, IOException {
		Account accounts[] = new Account[5];
		accounts[0] = new CurrentAccount(101, "abc", 5000, "07/08/2015", "09/03/1988");
		accounts[1] = new CurrentAccount(102, "def", 7000, "07/08/2014", "09/05/1975");
		accounts[2] = new CurrentAccount(103, "ghi", 9000, "07/08/2001", "03/06/1960");
		accounts[3] = new CurrentAccount(104, "jkl", 11000, "07/08/2010", "10/12/1990");
		accounts[4] = new CurrentAccount(105, "mno", 13000, "07/08/2000", "01/12/1978");
		
		printInfo(findRichAccHolder(accounts));
		Account youngAccHolders[]= findYoungAccHolders(accounts);
		printInfo(youngAccHolders);
		writeFile(accounts);
	}

	public static Account findRichAccHolder(Account[] accounts) {
		Account richAcc = accounts[0];
		for (int i = 0; i < accounts.length; i++) {
			double balance = 0;
			if (balance < accounts[i].getBalance()) {
				richAcc = accounts[i];
			}
		}
		return richAcc;
	}

	public static Account[] findYoungAccHolders(Account[] accounts) {
		int index = accounts[0].getYoungAccHolders(accounts);
		Account youngAccHolders[] = new Account[index];
		for (int i=0,j=0; i < accounts.length; i++) {
			if (accounts[i].getAge() < 30) {
				youngAccHolders[j] = accounts[i];
				j++;
			}
		}
		return youngAccHolders;
	}
	
	public static void writeFile(Account[] accounts) throws IOException {
		FileWriter writer = new FileWriter("Accounts.csv");
		writer.write("Type,Accno,Name,Balance,Creation Date,Age ");
		writer.write('\n');
		for (Account account : accounts) {
			writer.write(account.getClass() + "," + account.getAccNo() + ","
					+ account.getName() + "," + account.getBalance() + ","
					+ account.getCreationDate() + "," + account.getAge() + "\n");
			writer.write('\n');
		}
		writer.close();
	}
	
	public static void printInfo(Account[] accounts) {
		for(int i=0; i<accounts.length; i++) {
			printInfo(accounts[i]);
		}
	}
	
	public static void printInfo(Account account) {
		System.out.println("Acc No.\tName\tBalanace\tAge");
		System.out.println(account.getAccNo() + "\t" + account.getName() + "\t"
				+ account.getBalance() + "\t\t" + account.getAge());
	}

}
