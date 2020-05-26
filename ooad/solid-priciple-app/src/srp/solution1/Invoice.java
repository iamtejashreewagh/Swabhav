package srp.solution1;

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
		return (cost * gst) / 100;
	}

	public double calculateDiscountAmount() {
		return (cost * discountPercentage) / 100;
	}

	public double getCost() {
		return cost;
	}

	public float getGst() {
		return gst;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public double calculateTotalCost() {
		double TotalCost = cost + (cost * gst) / 100 - (cost * discountPercentage) / 100;
		return TotalCost;
	}

}
