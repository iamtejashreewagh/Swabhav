package isp.solution;

public class Manager implements IEatableWorkable{

	@Override
	public void startWork() {
		System.out.println("Manager have started working");
	}

	@Override
	public void stopWork() {
		System.out.println("Manager have stopped working");		
	}

	@Override
	public void startEat() {
		System.out.println("Manager have started eating");
		
	}

	@Override
	public void stopEat() {
		System.out.println("Manager have stopped eating");
		
	}

}
