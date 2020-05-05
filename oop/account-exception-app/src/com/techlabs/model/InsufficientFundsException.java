package com.techlabs.model;

public class InsufficientFundsException extends RuntimeException {
	Account account;
	public InsufficientFundsException(Account account) {
		super();
		this.account=account;
	}

	@Override
	public String getMessage() {
		return "The account owner " + account.getName() + " with id " + account.getId() + " and balance of "
				+ account.getBalance() + " couldn't withdraw the amount " + account.getAmount()
				+ " because the account is underbalance";
	}
}
