package com.techlabs.model;

public class Game {

	private int randomNumber;
	private int count;
	private String status="Game Not Started";

	public void generateNum() {
		setStatus("Game Started");
		randomNumber = (int) (100 * Math.random());
	}

	public int checkGuess(int guess) {
		count++;
		if (guess < randomNumber) {
			setStatus("Low GUess");
			return 0;
		} else if (guess > randomNumber) {
			setStatus("High GUess");
			return 2;
		} else {
			setStatus("Win");
			return 1;
		}
	}
	
	public int noOfAttempts() {
		setStatus("Game ended");
		return count;
	}
	
	public void setCount() {
		this.count=0;
	}
	
	public void setStatus(String status) {
		this.status=status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public int getRandomNum() {
		return randomNumber;
	}
}
