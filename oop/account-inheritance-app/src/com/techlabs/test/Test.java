package com.techlabs.test;

import com.techlabs.model.Account;
import com.techlabs.model.CurrentAccount;
import com.techlabs.model.SavingAccount;

public class Test {
	public static void main(String[] args) {
		SavingAccount sa= new SavingAccount(101, "abc", 10000);
		sa.deposit(500);
		printInfo(sa);
		
		CurrentAccount ca = new CurrentAccount(201, "xyz", 1000);
		ca.deposit(500);
		printInfo(ca);
	}
	
	public static void printInfo(Account acc) {
		System.out.println(acc.getBalance());
	}

}
