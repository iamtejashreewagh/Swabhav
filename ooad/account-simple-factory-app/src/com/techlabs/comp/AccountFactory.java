package com.techlabs.comp;

public class AccountFactory {
	private static AccountFactory instance;
	
	public static AccountFactory getInstance() {
		if (instance == null) {
			instance= new AccountFactory();
		}
		return instance;
	}
	
	public Account make(AccType accType) {
		if(accType==AccType.SA) {
			return new SavingAccount();
		}
		return new CurrentAccount();
	}

}
