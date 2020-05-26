package ocp.violation.test;
import ocp.violation.DiwaliFestival;
import ocp.violation.FixedDeposit;

public class FixedDepositTest {
	public static void main(String[] args) {
		FixedDeposit fd = new FixedDeposit(101, "abc", 10, 100000, new DiwaliFestival());
		System.out.println("Simple interest is  : "+ fd.calculateSimpleInterest());
	}

}
