package com.techlabs.model;

public class Game {

	private int randomNumber;
	public int count;

	public void generateNum() {
		randomNumber = (int) (100 * Math.random());
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
