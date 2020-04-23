package com.techlabs.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.model.Account;
import com.techlabs.model.CurrentAccount;
import com.techlabs.model.SavingAccount;

class TestToCheckGetNameMethod {

	@Test
	public void test() {
		Account account1 = new CurrentAccount(101, "abc", 5000);
		String expectedOutput = "abc";
		assertEquals(expectedOutput, account1.getName());
	}

}
