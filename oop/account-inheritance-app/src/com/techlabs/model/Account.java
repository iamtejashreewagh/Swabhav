package com.techlabs.model;

public abstract class Account {
	private int accountNumber;
	protected double balance;
	private String name;
	
	public Account(int accountNumber, String name, double balance) {
		this.name = name;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public void deposit(double amount) {
		balance=balance+amount;
	}
	
	abstract void withdraw(double amount);
	
	public double getBalance() {
		return balance;
	}
	
	public int getAccNo() {
		return accountNumber;
	}
	
	public String getName() {
		return name;
	}

}
