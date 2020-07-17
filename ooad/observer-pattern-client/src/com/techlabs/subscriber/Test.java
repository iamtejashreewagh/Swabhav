package com.techlabs.subscriber;

import com.techlabs.publisher.Account;

public class Test {
	
	public static void main(String[] args) {
		Account acc1 = new Account(101, "abc", 5000);
		acc1.addBalanceObserver(new SmsObserver());
		acc1.addBalanceObserver(new EmailObserver());
		acc1.deposit(1000);
	}

}
