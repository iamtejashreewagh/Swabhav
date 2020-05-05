package com.techlabs.test;

import com.techlabs.model.ExceptionClass;
import com.techlabs.model.MyCheckedException;

public class Test {
	public static void main(String[] args) throws MyCheckedException {
		ExceptionClass exception = new ExceptionClass();
		exception.m2();
		exception.m1();
	}

}
