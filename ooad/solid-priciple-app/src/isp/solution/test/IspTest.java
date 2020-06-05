package isp.solution.test;

import isp.solution.IEatable;
import isp.solution.IWorkable;
import isp.solution.Manager;
import isp.solution.Robot;
import isp.solution.IEatable;

public class IspTest {
	public static void main(String[] args) {
		Manager m =new Manager();
		Robot r = new Robot();
		atWorkStation(m);
		atWorkStation(r);
		atCafeteria(m);
	}
	
	public static void atCafeteria(IEatable w) {
		System.out.println("At cafeteria");
		w.startEat();
		w.stopEat();
	}
	
	public static void atWorkStation(IWorkable w) {
		System.out.println("At WorkStation");
		w.startWork();
		w.stopWork();
	}

}
