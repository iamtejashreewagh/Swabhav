package com.techlabs.comp;

class SavingAccount extends Account {

	@Override
	public void withdraw(double amount) {
		if (balance - amount > MINIMUM_BALANCE) {
			balance = balance - amount;
		} else {
			throw new InsufficientFundsException(this);
		}
	}

}
