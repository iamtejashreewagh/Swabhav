package com.techlabs.client;

import com.techlabs.comp.AccType;
import com.techlabs.comp.Account;
import com.techlabs.comp.AccountFactory;

public class Test {
	
	public static void main(String[] args) {
		AccountFactory factory = AccountFactory.getInstance();
		Account acc = factory.make(AccType.SA);
		acc.setAccNo(101);
		acc.setName("abc");
		acc.deposit(10000);
		
		//acc.withdraw(10000);
		
		acc.withdraw(8000);
		printInfo(acc);
		
		Account acc2 = factory.make(AccType.CA);
		acc2.setAccNo(102);
		acc2.setName("abc");
		acc2.deposit(10000);
		acc2.withdraw(100000);
		printInfo(acc2);
	}
	
	public static void printInfo(Account acc) {
		System.out.println("Account number is : "+acc.getAccNo());
		System.out.println("Account holder's name is "+acc.getName());
		System.out.println("This account is a " + acc.getClass().getSimpleName());
	}

}
