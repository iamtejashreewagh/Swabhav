package com.techlabs.model;

import java.util.Timer;
import java.util.TimerTask;

public class Remote {
	private DogDoor door;
	
	public Remote (DogDoor door) {
		this.door=door;
	}
	
	public void pressButton() {
		System.out.println("Pressing the button...");
		if(door.isOpen()) {
			door.close();
		}
		else {
			door.open();
		}
	}

}
