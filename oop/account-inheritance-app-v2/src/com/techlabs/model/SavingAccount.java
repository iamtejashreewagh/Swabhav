package com.techlabs.model;

import java.text.ParseException;
import java.util.Date;

public class SavingAccount extends Account {

	public SavingAccount(int accountNumber, String name, double balance, String creatioDate, String dateOfBirth)
			throws ParseException {
		super(accountNumber, name, balance, creatioDate, dateOfBirth);
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
