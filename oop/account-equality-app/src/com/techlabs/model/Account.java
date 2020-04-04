package com.techlabs.model;

public class Account {
	private int id;
	private String name;
	private double amount;
	private double balance;
	private static int MINIMUM_BALANCE;
	private static int numOfTransactions;

	static {
		numOfTransactions = 0;
	}

	public Account(int id, String name, double amount) {
		this.id = id;
		this.name = name;
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		String info = super.toString() + "\nid :" + id + "\nname : " + name + "\nammount : " + amount;
		return info;
	}
	
	@Override
	public boolean equals (Object second) {
		Account acc = (Account) second;
		if(this.id==acc.id && this.name==acc.name && this.amount==acc.amount) {
		return true;
		}
		return false;
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

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getAmount() {
		return amount;
	}

}
