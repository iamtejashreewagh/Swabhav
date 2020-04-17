package com.techlabs.model;

public class SavingAccount extends Account {

	public SavingAccount(int accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
	}

	@Override
	void withdraw(double amount) {
		if (balance>1000 && balance>amount)
		{
			balance=balance- amount;
		}
		else {
			System.out.println("Withdraw failed");
		}
	}

}
