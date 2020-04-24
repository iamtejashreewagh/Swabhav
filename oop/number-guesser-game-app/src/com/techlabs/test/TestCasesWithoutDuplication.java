package com.techlabs.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.model.Game;

class TestCasesWithoutDuplication {
	Game game = new Game();
	private int lowGuess = game.getRandomNum() - 1;
	private int highGuess = game.getRandomNum() + 1;
	private int correctGuess = game.getRandomNum();

	@Test
	void test_ToCheckWhetherGenerateNumberMethodWorks() {
		game.generateNum();
		assertEquals(game.getRandomNum() >= 0 && game.getRandomNum() <= 100, true);
	}
	
	@Test
	void test_ToCheckWorkingOfCheckGuessMethodForLowGuess() {
		game.generateNum();
		assertEquals(game.checkGuess(lowGuess), 0);
	}
	
	@Test
	void test_ToCheckWorkingOfCheckGuessMethodForHighGuess() {
		game.generateNum();
		assertEquals(game.checkGuess(highGuess), 2);
	}
	
	@Test
	void test_ToCheckWorkingOfCheckGuessMethodForCorrectGuess() {
		game.generateNum();
		assertEquals(game.checkGuess(correctGuess), 1);
	}
	
	@Test
	void test_ToCheckTheGameStatusMethod() {
		assertEquals(game.getStatus(), "Game Not Started"); // Before starting game
		game.generateNum();
		assertEquals(game.getStatus(), "Game Started"); // Game starts
		game.checkGuess(lowGuess);
		assertEquals(game.getStatus(), "Low GUess");//When user guess is low
		game.checkGuess(highGuess);
		assertEquals(game.getStatus(), "High GUess");//When user guess is high
		game.checkGuess(correctGuess);
		assertEquals(game.getStatus(), "Win");//When user guess is correct
	}
}
