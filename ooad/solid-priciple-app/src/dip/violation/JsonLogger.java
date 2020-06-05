package dip.violation;

public class JsonLogger {
	public void Log(Exception ex) {
		System.out.println("Error : " + ex.getMessage());
	}

}
