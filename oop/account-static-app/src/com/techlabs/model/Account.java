package com.techlabs.model;

public class Account {
	private double balance;
	private static int MINIMUM_BALANCE;
	private static int numOfTransactions ;
	
	static {
		numOfTransactions = 0;
	}

	public void withdraw(double amount) {
		if (balance - amount > MINIMUM_BALANCE) {
			balance = balance - amount;
			numOfTransactions++;
		}
	}
	
	public void deposit(double amount) {
			balance = balance + amount;
			numOfTransactions++;
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
	
	public static int getNumOfTransactions() {
		return numOfTransactions;
	}

}
