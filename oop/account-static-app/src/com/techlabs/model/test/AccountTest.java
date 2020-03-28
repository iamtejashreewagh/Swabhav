package com.techlabs.model.test;

import com.techlabs.model.Account;

public class AccountTest {
	
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.setMinimumBalance(1000);
		a1.setBalance(123456);
		a1.withdraw(345);
		System.out.println("Total balance = " + a1.getBalance());
		
	}

}
