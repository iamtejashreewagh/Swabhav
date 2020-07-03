package com.techlabs.factory.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

import com.techlabs.factory.IAuto;
import com.techlabs.factory.IAutoFactory;
import com.techlabs.factory.TeslaFactory;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
		IAutoFactory factory = injectDependency();
		IAuto auto = factory.make();
		auto.start();
		auto.stop();
	}

	private static Properties readFile(String fileName) throws IOException {
		FileInputStream file = null;
		Properties properties = null;
		file = new FileInputStream(fileName);
		properties = new Properties();
		try {
			properties.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			file.close();
		}
		return properties;
	}

	private static IAutoFactory injectDependency() throws IOException, ClassNotFoundException, NoSuchMethodException,
			SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Properties properties = readFile("src/dependency/factory.properties");
		Class cls = Class.forName(properties.getProperty("factory"));
		Method m = cls.getDeclaredMethod("getInstance", null);
		return (IAutoFactory) m.invoke(null, null);
	}

}
