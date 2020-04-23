package com.techlabs.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.model.Account;
import com.techlabs.model.SavingAccount;

class TestToCheckGetBalanceMethod {

	@Test
	public void test() {
		Account account1 = new SavingAccount(101, "abc", 5000);
		double expectedOutput = 5000;
		assertEquals(expectedOutput, account1.getBalance());
	}

}
