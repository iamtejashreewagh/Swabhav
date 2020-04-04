package com.techlabs.model;

import java.io.Serializable;

public class Account implements Serializable{
	
	private int id;
	private String name;
	private double balance;
	private static int MINIMUM_BALANCE;

	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) {
		if (balance - amount > MINIMUM_BALANCE) {
			balance = balance - amount;
		}
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static void setMinimumBalance(int minBalance) {
		MINIMUM_BALANCE = minBalance;
	}

	public double getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	}



