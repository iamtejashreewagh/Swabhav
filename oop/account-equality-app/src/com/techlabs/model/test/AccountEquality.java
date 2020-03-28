package com.techlabs.model.test;

import com.techlabs.model.Account;

public class AccountEquality {
	public static void main(String[] args) {
		
		System.out.println("Test case 1 :");
		Account acc1= new Account(101, "abc", 5000);
		Account acc2= new Account(101, "abc", 5000);
		System.out.println("acc1 hash : " + acc1.hashCode());
		System.out.println("acc2 hash : " + acc2.hashCode());
		Account acc3= acc1;
		System.out.println(acc1==acc1);
		System.out.println(acc1==acc2);
		System.out.println(acc3==acc1);
		
		System.out.println("Test case 2 :");
		System.out.println(acc1.equals(acc1));
		System.out.println(acc1.equals(acc2));
		
		
	}

}
