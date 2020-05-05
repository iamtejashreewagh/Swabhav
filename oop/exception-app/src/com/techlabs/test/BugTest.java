package com.techlabs.test;

public class BugTest {
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Any integer cannot be divided by zero");
		}
		catch(NumberFormatException e ) {
			System.out.println("Only integers were supposed to be passed");
		}
		catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Minimun two integers were supposed to be passed");
		}
		
		System.out.println("End of main");
	}

}
