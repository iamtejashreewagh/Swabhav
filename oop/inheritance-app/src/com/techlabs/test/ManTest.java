package com.techlabs.test;

import com.techlabs.model.Boy;
import com.techlabs.model.Infant;
import com.techlabs.model.Kid;
import com.techlabs.model.Man;

public class ManTest {
	public static void main(String[] args) {
		//case1();
		//case2();
		//case3();
		case4();
		case5();
	}
	
	public static void case1() {
		Man x;
		x = new Man();
		x.play();
		x.read();
		x.walk();
		System.out.println("\n");
	}
	
	public static void case2() {
		Boy y;
		y= new Boy();
		y.play();
		y.eat();
		y.read();
		y.walk();
	}
	
	public static void case3() {
		System.out.println("\n");
		Man x;
		x = new Boy();
		x.play();
		x.walk();
		x.read();
	}
	
	public static void case4() {
		System.out.println("\n");
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());
		atThePark(new Infant());
	}
	
	public static void atThePark(Man x) {
		System.out.println("At the park");
		x.play();
	}
	
	public static void case5() {
		Object x;
		x= 10;
		System.out.println(x.getClass());
		x="hello";
		System.out.println(x.getClass());
		x=10<20;
		System.out.println(x.getClass());
		x=new Integer(20);
		System.out.println(x.getClass());
	}

}
