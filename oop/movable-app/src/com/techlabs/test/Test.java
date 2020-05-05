package com.techlabs.test;

import com.techlabs.model.Bike;
import com.techlabs.model.Car;
import com.techlabs.model.IMovable;
import com.techlabs.model.Truck;

public class Test {
	public static void main(String[] args) {
		IMovable[] movables = new IMovable[3];
		movables[0] = new Car();
		movables[1] = new Bike();
		movables[2] = new Truck();
		startRace(movables);
	}
	
	private static void startRace(IMovable[] movables) {
		for(IMovable movable:movables) {
			movable.move();
		}
	}

}

