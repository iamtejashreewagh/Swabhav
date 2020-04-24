package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.model.Bark;
import com.techlabs.model.BarkRecognizer;
import com.techlabs.model.DogDoor;

class TestCases {

	@Test
	void test_ToCheckRecognizeMethodOfBarkRecognizerClass() {
		DogDoor door = new DogDoor();
		BarkRecognizer recognizer = new BarkRecognizer(door);
		door.addAllowedBark(new Bark("woof"));
		Bark bark1 = new Bark("woof");
		Bark bark2 = new Bark("yip");
		recognizer.recognize(bark1);
		assertEquals(door.isOpen(),true);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {}
		recognizer.recognize(bark2);
		assertEquals(door.isOpen(),false);
	}
	
	@Test
	void test_ToCheckGetSoundMethodOfBarkClass() {
		DogDoor door = new DogDoor();
		BarkRecognizer recognizer = new BarkRecognizer(door);
		door.addAllowedBark(new Bark("woof"));
		Bark bark1 = new Bark("woof");
		Bark bark2 = new Bark("yip");
		assertEquals(bark1.getSound(),"woof");
		assertEquals(bark2.getSound(),"yip");
	}
	
	@Test
	void test_ToCheckWhetherDoorRemainsOpenFor5Seconds() {
		DogDoor door = new DogDoor();
		door.open();
		try {
			Thread.sleep(3000); //before 5 seconds the door is open
		} catch (InterruptedException e) {}
		assertEquals(door.isOpen(),true);
		
		try {
			Thread.sleep(5001); //after 5 seconds the door is not open
		} catch (InterruptedException e) {}
		assertEquals(door.isOpen(),false);
	}
	
	@Test
	void test_ToCheckIfTheDoorOpensIfDogIsStuckOutside() {
		DogDoor door = new DogDoor();
		door.close();
		BarkRecognizer recognizer = new BarkRecognizer(door);
		door.addAllowedBark(new Bark("woof"));
		Bark bark = new Bark("woof");
		recognizer.recognize(bark);
		assertEquals(door.isOpen(),true);
	}
	
	@Test
	void test_ToCheckIfTheDoorOpenOnOtherBarks() {
		DogDoor door = new DogDoor();
		BarkRecognizer recognizer = new BarkRecognizer(door);
		door.addAllowedBark(new Bark("woof"));
		Bark bark = new Bark("yip");
		recognizer.recognize(bark);
		assertEquals(door.isOpen(),false);
	}
}
