package com.techlabs.test;

import com.techlabs.model.Game;
import com.techlabs.model.GameTerminal;

public class PlayTest {
	public static void main(String[] args) {
		GameTerminal terminal = new GameTerminal();
		Game number = new Game();
		int choice = 1;
		while(choice == 1) {
			number.generateNum();
			choice = terminal.game(number);
		
		}
		
	}

}
