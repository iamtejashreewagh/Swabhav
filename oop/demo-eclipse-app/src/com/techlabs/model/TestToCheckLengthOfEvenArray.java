package com.techlabs.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestToCheckLengthOfEvenArray {

	@Test
	public void test() {
		OddEven test1 = new OddEven();
		int expectedOutput=51;
		assertEquals(expectedOutput, test1.getEvenNumbers(0, 100).length);
	}

}
