package com.techlabs.model.test;

import java.util.ArrayList;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] arg) {

		Vector<Integer> v = new Vector<Integer>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);

		arrayList.add(6);
		arrayList.add(7);
		arrayList.add(8);
		arrayList.add(9);

		v.addAll(arrayList);

		System.out.println(v.lastElement());

		System.out.println("Vector is " + v);
	}
}