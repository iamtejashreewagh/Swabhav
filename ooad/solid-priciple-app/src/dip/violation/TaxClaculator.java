package dip.violation;

public class TaxClaculator {
	private LogType logType;
	
	public TaxClaculator(LogType logType) {
		this.logType=logType;
	}
	
	public int calculateTax(int ammount, int rate) {
		try {
			int result = ammount/rate;
			return result;
			
		}catch(Exception ex) {
			if(logType.equals(LogType.JSON)) {
				new JsonLogger().Log(ex);
			}
			else if(logType.equals(LogType.TXT)) {
				new TxtLogger().Log(ex);
			}
			else if(logType.equals(LogType.XML)) {
				new XmlLogger().Log(ex);
			}
			return -1;
		}
	}

}
