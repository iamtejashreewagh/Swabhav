package com.techlabs.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitSquareTest {

	@Test
	public void test() {
		Junit test = new Junit();
		int output = test.square(9);
		assertEquals(81, output);
	}

}
