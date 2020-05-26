package srp.violation.test;

import srp.violation.Invoice;

public class InvoiceTest {
	public static void main(String[] args) {
		Invoice invoice = new Invoice(101, "abc", 100, 5.0f);
		invoice.print();
	}

}
