package isp.violation.test;

import isp.violation.IWorker;
import isp.violation.Manager;
import isp.violation.Robot;

public class IspTest {
	public static void main(String[] args) {
		Manager m =new Manager();
		Robot r = new Robot();
		atCafeteria(m);
		atWorkStation(m);
		atWorkStation(r);
		atCafeteria(r);
	}
	
	public static void atCafeteria(IWorker w) {
		System.out.println("At cafeteria");
		w.startEat();
		w.stopEat();
	}
	
	public static void atWorkStation(IWorker w) {
		System.out.println("At WorkStation");
		w.startWork();
		w.stopWork();
	}

}
