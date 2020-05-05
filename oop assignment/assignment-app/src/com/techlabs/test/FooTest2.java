package com.techlabs.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.techlabs.model.Foo;
import com.techlabs.model.MyBeforeUnitTestCase;
import com.techlabs.model.UnitTestCase;

public class FooTest2 {
	public static void main(String args[])
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Foo obj = new Foo();

		getMethods(obj.getClass(), obj);
	}

	public static void getMethods(Class className, Object obj)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method before = invokeBeforeMethod(className);
		Method[] methods = className.getDeclaredMethods();
		for (Method method : methods) {
			before.invoke(obj);
			if (method.isAnnotationPresent(UnitTestCase.class)) {
				if ((boolean) method.invoke(obj)) {
					System.out.println(method.getName() + " is passing case");
				} else
					System.out.println(method.getName() + " is failing case");
			} else {
				System.out.println(method.getName() + " is not a testcase");
			}
		}
	}
	
	public static Method invokeBeforeMethod(Class className) {
		Method[] methods=className.getDeclaredMethods();
		Method before = null;
		for(Method method: methods) {
			if (method.isAnnotationPresent(MyBeforeUnitTestCase.class)) {
				before = method;
			}
		}
		return before; 
	}

}
