package com.techlabs.test;

import com.techlabs.model.Account;
import com.techlabs.model.InsufficientFundsException;

public class Test {
	public static void main(String[] args) {
		Account account = new Account(101, "Tejashree", 1000);
		account.setMinimumBalance(500);
		try {
			account.withdraw(600);
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("end of main");
	}
}