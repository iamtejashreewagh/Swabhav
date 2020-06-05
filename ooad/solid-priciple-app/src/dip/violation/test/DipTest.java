package dip.violation.test;

import dip.violation.LogType;
import dip.violation.TaxClaculator;

public class DipTest {
	public static void main(String[] args) {
		TaxClaculator calculator = new TaxClaculator(LogType.XML);
		System.out.println(calculator.calculateTax(10, 5));
		System.out.println(calculator.calculateTax(0, 0));
	}

}
