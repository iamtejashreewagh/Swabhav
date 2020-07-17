package com.techlabs.subscriber;

import com.techlabs.publisher.Account;
import com.techlabs.publisher.IBalanceObserver;

public class EmailObserver implements IBalanceObserver {
	
	public EmailObserver() {
		System.out.println("Inside Email Observer");
	}

	@Override
	public void update(Account acc) {
		System.out.println("Balance has changed to " + acc.getBalance() + " for " + acc.getName() + " with AccNo "
				+ acc.getAccNo());
		System.out.println("Email sent");
		
	}

}
