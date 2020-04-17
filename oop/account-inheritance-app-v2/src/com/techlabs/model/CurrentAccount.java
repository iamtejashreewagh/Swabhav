package com.techlabs.model;

import java.text.ParseException;
import java.util.Date;

public class CurrentAccount extends Account {

	public CurrentAccount(int accountNumber, String name, double balance, String creatioDate, String dateOfBirth)
			throws ParseException {
		super(accountNumber, name, balance, creatioDate, dateOfBirth);
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
