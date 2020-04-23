package com.techlabs.model.test;

import com.techlabs.model.BarkRecognizer;
import com.techlabs.model.DogDoor;
import com.techlabs.model.Remote;

public class DogDoorSimulator {
	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		BarkRecognizer recognizer = new BarkRecognizer(door);
		Remote remote = new Remote(door);
		
		System.out.println("Fido barks to go outside!");
		recognizer.recognize("Woof");
		
		System.out.println("Fiddo's gone outside!");
		System.out.println("Fiddo's all done!");
		
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {		}
		
		System.out.println("But Fido's stuck outside");
		System.out.println("Fido starts barking");
		recognizer.recognize("Woof");
		System.out.println("Fido's back inside");
	}

}
