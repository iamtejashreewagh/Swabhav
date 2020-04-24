package com.techlabs.model;

import java.util.Scanner;

import com.techlabs.model.Game;

public class GameTerminal {

	public static int game(Game game) {
		int result = 0;
		for (int i = 0; result != 1; i++) {
			Scanner sguess = new Scanner(System.in);
			System.out.println("Guess a number from 1 - 100");
			int guess = sguess.nextInt();
			result = game.checkGuess(guess);
			if (result == 0) {
				System.out.println("Sorry, too low");
			}
			else if (result == 2) {
				System.out.println("Sorry, too high");
			}
		}
		System.out.println("Your guess is correct, you won!\n" + "With " + game.noOfAttempts() + " number of attempts");
		Scanner ch = new Scanner(System.in);
		System.out.println("1. Start a new game\n2.Exit the game");
		game.setCount();
		int choice = ch.nextInt();
		return choice;
	}

}
