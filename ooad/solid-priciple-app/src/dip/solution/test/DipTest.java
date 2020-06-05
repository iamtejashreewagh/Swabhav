package dip.solution.test;

import dip.solution.ILog;
import dip.solution.TaxCalculator;
import dip.solution.XmlLogger;

public class DipTest {
	public static void main(String[] args) {
		TaxCalculator calculator = new TaxCalculator(new XmlLogger());
		System.out.println(calculator.calculateTax(10, 5));
		System.out.println(calculator.calculateTax(0, 0));
	}

}
