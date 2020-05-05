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

	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public void withdraw(double amount){
		if(balance-amount>MINIMUM_BALANCE) {
			balance = balance - amount;
		}
		else {
			throw new InsufficientFundsException(this);
		}
		numOfTransactions++;
	}

	public void deposit(double amount) {
		balance = balance + amount;
		numOfTransactions++;
	}

	public static void setMinimumBalance(int minimumBalance) {
		MINIMUM_BALANCE = minimumBalance;
	}

	public static int getMinimumBalance() {
		return MINIMUM_BALANCE;
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
