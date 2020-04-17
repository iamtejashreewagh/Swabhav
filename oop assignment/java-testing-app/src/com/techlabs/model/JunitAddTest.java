package com.techlabs.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitAddTest {

	@Test
	public void test() {
		Junit test = new Junit();
		int output = test.add(20, 10);
		assertEquals(30, output);
	}

}
