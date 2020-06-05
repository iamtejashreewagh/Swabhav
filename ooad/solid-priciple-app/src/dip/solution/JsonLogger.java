package dip.solution;

public class JsonLogger implements ILog{

	@Override
	public void log(String ex) {
		System.out.println("Error in wriring json file : "+ex);
		
	}

}
