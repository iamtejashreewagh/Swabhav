package com.techlabs.model;

public class Account {
	private double balance;
	private static int MINIMUM_BALANCE;

	public void withdraw(double amount) {
		if (balance - amount > MINIMUM_BALANCE) {
			balance = balance - amount;
		}
	}

	public static void setMinimumBalance(int minimumBalance) {
		MINIMUM_BALANCE = minimumBalance;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
