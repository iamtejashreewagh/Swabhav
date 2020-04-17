package com.techlabs.model;

public class CurrentAccount extends Account {

	public CurrentAccount(int accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
	}

	@Override
	void withdraw(double amount) {
		if((balance>amount)||(balance==0 && amount<5000)) {
			balance = balance - amount;
		}
		else {
			System.out.println("Withdraw failed");
		}
	}

}
