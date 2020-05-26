package srp.solution1;

public class DisplayInvoiceDetails {
	private Invoice invoice;
	
	public DisplayInvoiceDetails(Invoice invoice) {
		this.invoice=invoice;
	}
	
	public void print() {
		System.out.println("Cost is : " + invoice.getCost());
		System.out.println("GST % is : " + invoice.getGst());
		System.out.println("Discount percentage is : " + invoice.getDiscountPercentage());
		System.out.println("Total cost is : " + invoice.calculateTotalCost());
	}

}
