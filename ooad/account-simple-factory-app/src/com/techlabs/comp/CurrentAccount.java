package com.techlabs.comp;

class CurrentAccount extends Account {

	@Override
	public void withdraw(double amount) {
		balance = balance - amount;

	}

}
