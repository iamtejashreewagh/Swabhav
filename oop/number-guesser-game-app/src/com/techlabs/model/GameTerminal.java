package com.techlabs.model;

import java.util.Scanner;

import com.techlabs.model.Game;

public class GameTerminal {
	public static void main(String[] args) {
		int result = 0;
		int noOfTries=0;
		Game number = new Game();
		int choice = 1;
		while(choice == 1) {
			number.generateNum();
			choice = game(number);
		
		}
		
	}
	
	public static int game(Game number) {
		int result=0;
		for (int i=0; result!=1; i++) {
			Scanner sguess= new Scanner(System.in);
			System.out.println("Guess a number from 1 - 100");
			int guess= sguess.nextInt();
			result= number.checkGuess(guess);
			if (result==0)
				System.out.println("Sorry, too low");
			else if(result==2)
				System.out.println("Sorry, too high");
		}
		System.out.println("Your guess is correct, you won!\n" + "With "+ number.noOfAttempts() +" number of attempts");
		Scanner ch = new Scanner(System.in);
		System.out.println("1. Start a new game\n2.Exit the game");
		int choice = ch.nextInt();
		return choice;
		}

}
	
