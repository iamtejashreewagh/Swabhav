package dip.violation;

public class XmlLogger {
	public void Log(Exception ex) {
		System.out.println("Error  : " + ex.getMessage());
	}

}
