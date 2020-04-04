package com.techlabs.model;

public class Game {

	private int randomNumber;
	public int count;

	public int generateNum() {
		randomNumber = (int) (100 * Math.random());
		return randomNumber;
	}

	public int checkGuess(int guess) {
		count++;
		if (guess < randomNumber) {
			return 0;
		} else if (guess > randomNumber) {
			return 2;
		} else {
			return 1;
		}
	}
	
	public int noOfAttempts() {
		return count;
	}
	
	
}
