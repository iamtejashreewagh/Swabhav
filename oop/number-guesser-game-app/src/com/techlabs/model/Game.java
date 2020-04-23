package com.techlabs.model;

public class Game {

	private int randomNumber;
	private int count;

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
	
	public void setCount() {
		this.count=0;
	}
	
	
}
