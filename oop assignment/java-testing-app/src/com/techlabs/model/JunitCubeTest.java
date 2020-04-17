package com.techlabs.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitCubeTest {

	@Test
	public void test() {
		Junit test = new Junit();
		int output = test.cube(5);
		assertEquals(125, output);
	}

}
