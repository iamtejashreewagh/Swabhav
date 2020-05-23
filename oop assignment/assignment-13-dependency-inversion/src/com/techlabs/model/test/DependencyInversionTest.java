package com.techlabs.model.test;

import com.techlabs.model.BackEndDeveloper;
import com.techlabs.model.FrontEndDeveloper;
import com.techlabs.model.IDeveloper;

public class DependencyInversionTest {
	public static void main(String args[]) {
		IDeveloper developer1= new FrontEndDeveloper();
		developer1.develop();
		
		IDeveloper developer2 = new BackEndDeveloper();
		developer2.develop();
	}
}
