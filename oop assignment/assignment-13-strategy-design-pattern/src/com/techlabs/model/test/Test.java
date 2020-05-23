package com.techlabs.model.test;

import com.techlabs.model.Context;
import com.techlabs.model.OperationAddition;
import com.techlabs.model.OperationSubstraction;

public class Test {
	public static void main(String[] args) {
	      Context context = new Context(new OperationAddition());		
	      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

	      context = new Context(new OperationSubstraction());		
	      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

	   }

}
