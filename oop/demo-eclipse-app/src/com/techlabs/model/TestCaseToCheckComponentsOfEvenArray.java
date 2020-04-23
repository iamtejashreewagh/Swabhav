package com.techlabs.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCaseToCheckComponentsOfEvenArray {

	@Test
	public void test() {
		OddEven test1 = new OddEven();
		assertEquals(0, test1.getEvenNumbers(0, 6)[0]);
		assertEquals(2, test1.getEvenNumbers(0, 6)[1]);
		assertEquals(4, test1.getEvenNumbers(0, 6)[2]);
		assertEquals(6, test1.getEvenNumbers(0, 6)[3]);
	}

}
