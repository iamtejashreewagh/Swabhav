package srp.violation;

public class Invoice {
	private int id;
	private String name;
	private double cost;
	private float discountPercentage;
	static final float gst = 12;

	public Invoice(int id, String name, double cost, float discountPercentage) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discountPercentage = discountPercentage;
	}
	
	public double calculateTax() {
		double tax = (cost*gst)/100;
		return tax;
	}
	
	public double calculateDiscountAmount() {
		double discountAmt = (cost*discountPercentage)/100;
		return discountAmt;
	}
	
	public double calculateTotalCost() {
		double totalCost= cost + this.calculateTax() - this.calculateDiscountAmount();
		return totalCost;
	}
	
	public void print() {
		System.out.println("Cost is : "+ this.cost);
		System.out.println("GST % is : "+ this.gst);
		System.out.println("Discount percentage is : "+ this.discountPercentage);
		System.out.println("Total cost is : "+this.calculateTotalCost());
	}

}
