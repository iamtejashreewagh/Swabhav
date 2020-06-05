package dip.solution;

public class XmlLogger implements ILog{

	@Override
	public void log(String ex) {
		System.out.println("Error in writing xml file : "+ex);
		
	}
	

}
