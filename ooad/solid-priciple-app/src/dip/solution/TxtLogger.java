package dip.solution;

public class TxtLogger implements ILog{

	@Override
	public void log(String ex) {
		System.out.println("Error in wriring txt file : "+ex);
	}

}
