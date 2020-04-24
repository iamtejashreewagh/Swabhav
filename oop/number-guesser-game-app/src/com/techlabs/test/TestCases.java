package com.techlabs.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.model.Game;

class TestCases {

	@Test
	void test_ToCheckWhetherGenerateNumberMethodWorks() {
		Game game = new Game();
		game.generateNum();
		assertEquals(game.getRandomNum() >= 0 && game.getRandomNum() <= 100, true);
	}

	@Test
	void test_ToCheckWorkingOfCheckGuessMethodForLowGuess() {
		Game game = new Game();
		game.generateNum();
		int lowGuess = game.getRandomNum() - 1;
		assertEquals(game.checkGuess(lowGuess), 0);
	}

	@Test
	void test_ToCheckWorkingOfCheckGuessMethodForHighGuess() {
		Game game = new Game();
		game.generateNum();
		int highGuess = game.getRandomNum() + 1;
		assertEquals(game.checkGuess(highGuess), 2);
	}

	@Test
	void test_ToCheckWorkingOfCheckGuessMethodForCorrectGuess() {
		Game game = new Game();
		game.generateNum();
		int correctGuess = game.getRandomNum();
		assertEquals(game.checkGuess(correctGuess), 1);
	}

	@Test
	void test_ToCheckTheGameStatusMethod() {
		Game game = new Game();
		assertEquals(game.getStatus(), "Game Not Started"); // Before starting game
		game.generateNum();
		assertEquals(game.getStatus(), "Game Started"); // Game starts
		int lowGuess = game.getRandomNum() - 1;
		game.checkGuess(lowGuess);
		assertEquals(game.getStatus(), "Low GUess");//When user guess is low
		int highGuess = game.getRandomNum() + 1;
		game.checkGuess(highGuess);
		assertEquals(game.getStatus(), "High GUess");//When user guess is high
		int correctGuess = game.getRandomNum();
		game.checkGuess(correctGuess);
		assertEquals(game.getStatus(), "Win");//When user guess is correct
	}
}
