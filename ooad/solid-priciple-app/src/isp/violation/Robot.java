package isp.violation;

public class Robot implements IWorker{

	@Override
	public void startWork() {
		System.out.println("Robot have started working");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Robot have stopped working");
		
	}

	@Override
	public void startEat() {
		throw new RuntimeException("Robots don't eat");
	}

	@Override
	public void stopEat() {
		throw new RuntimeException("Robots don't eat");
	}

}
