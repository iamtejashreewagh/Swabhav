package srp.solution1.test;

import java.awt.print.Printable;

import srp.solution1.DisplayInvoiceDetails;
import srp.solution1.Invoice;

public class InvoiceTest {
	public static void main(String[] args) {
		Invoice invoice = new Invoice(101, "abc", 100, 5.0f);
		DisplayInvoiceDetails display = new DisplayInvoiceDetails(invoice);
		display.print();
	
	}
}
