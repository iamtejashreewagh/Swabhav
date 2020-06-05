package isp.solution;

public class Robot implements IWorkable{

	@Override
	public void startWork() {
		System.out.println("Robot have started working");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Robot have stopped working");
		
	}

}
