package dip.solution;

public class TaxCalculator {
	private ILog logType;

	public TaxCalculator(ILog logType) {
		this.logType = logType;
	}
	
	public int calculateTax(int ammount, int rate) {
		try {
			int tax = ammount/rate;
			return tax;
			
		}catch(Exception ex) {
			logType.log(ex.getMessage());
		}
		return -1;
	}

}
