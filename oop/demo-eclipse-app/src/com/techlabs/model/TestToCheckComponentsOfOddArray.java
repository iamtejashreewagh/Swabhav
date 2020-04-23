package com.techlabs.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestToCheckComponentsOfOddArray {

	@Test
	public void test() {
		OddEven test1 = new OddEven();
		assertEquals(1, test1.getOddNumbers(0, 6)[0]);
		assertEquals(3, test1.getOddNumbers(0, 6)[1]);
		assertEquals(5, test1.getOddNumbers(0, 6)[2]);
		}

}
