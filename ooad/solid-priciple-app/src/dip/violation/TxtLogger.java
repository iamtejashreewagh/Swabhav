package dip.violation;

public class TxtLogger {
	public void Log(Exception ex) {
		System.out.println("Error : " + ex.getMessage());
	}

}
