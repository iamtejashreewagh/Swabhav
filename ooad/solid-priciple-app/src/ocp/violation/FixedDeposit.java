package ocp.violation;

public class FixedDeposit{
	private int accno;
	private String name;
	private double principal;
	private int duration;
	private IRateGetter festival;
	
	public FixedDeposit(int accno, String name, int duration, double principal, IRateGetter festival) {
		this.accno = accno;
		this.name = name;
		this.duration = duration;
		this.principal = principal;
		this.festival = festival;
	}
	
	
	public double calculateSimpleInterest() {
		double si = (principal*festival.getRate()*duration)/100;
		return si;
	}
	
	

}
