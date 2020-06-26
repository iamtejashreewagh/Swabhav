package com.techlabs.comp;

public class InsufficientFundsException extends RuntimeException {
	Account account;
	public InsufficientFundsException(Account account) {
		super();
		this.account=account;
	}

	@Override
	public String getMessage() {
		return "The account is underbalance";
	}
}
