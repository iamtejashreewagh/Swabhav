package com.techlabs.publisher;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int accNo;
	private String name;
	private double balance;
	private List<IBalanceObserver> observers = new ArrayList<IBalanceObserver>();

	public Account(int accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public void addBalanceObserver(IBalanceObserver observer) {
		observers.add(observer);
	}

	public void deposit(double amt) {
		balance = balance + amt;
		updateAll();
	}

	public void withdraw(double amt) {
		if (balance > amt) {
			balance = balance - amt;
		}
		else
			System.out.println("Insufficient balance");
		updateAll();
	}
	
	public void updateAll() {
		for(IBalanceObserver observer : observers) {
			observer.update(this);
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAccNo() {
		return accNo;
	}

}
