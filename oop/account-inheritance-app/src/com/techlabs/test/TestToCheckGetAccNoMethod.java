package com.techlabs.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.model.Account;
import com.techlabs.model.SavingAccount;

class TestToCheckGetAccNoMethod {

	@Test
	public void test() {
		Account account1 = new SavingAccount(103, "abc", 5000);
		int expectedOutput = 103;
		assertEquals(expectedOutput, account1.getAccNo());
	}

}
