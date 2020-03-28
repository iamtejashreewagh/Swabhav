package com.techlabs.model.test;

import com.techlabs.model.Account;

public class AccountTest {
	
	public static void main(String[] args) {
		
		System.out.println("Test Case 1 :");
		Account.setMinimumBalance(1000);
		Account a1 = new Account();
		a1.setBalance(123456);
		a1.withdraw(345);
		System.out.println("Total balance = " + a1.getBalance());
		
		System.out.println("Test Case 2 :");
		a1.deposit(100);
		a1.withdraw(50);
		a1.deposit(50);
		Account a2 = new Account();
		a2.withdraw(100);
		System.out.println(Account.getNumOfTransactions());
	}

}
