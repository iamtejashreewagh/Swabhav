package com.techlabs.comp;


public abstract class Account {
	private int accNo;
	private String name;
	private double amount;
	protected double balance;
	protected static int MINIMUM_BALANCE=500;
	

	public abstract void withdraw(double amount);

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}


}
