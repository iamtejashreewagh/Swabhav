package com.techlabs.test;

import com.techlabs.model.Boy;
import com.techlabs.model.IEmotional;
import com.techlabs.model.IMannerable;
import com.techlabs.model.Man;

public class Test {
	public static void main(String[] args) {
		Man man = new Man();
		Boy boy = new Boy(); 
		atThePartyHall(man);
		atThePartyHall(boy);
		
		atTheCinemaHall(boy);
	}
	
	private static void atTheCinemaHall(IEmotional obj) {
		System.out.println("At the cinema hall");
		obj.cry();
		obj.laugh();
	}
	
	private static void atThePartyHall(IMannerable obj) {
		System.out.println("At the party hall");
		obj.wish();
		obj.depart();
	}

}
