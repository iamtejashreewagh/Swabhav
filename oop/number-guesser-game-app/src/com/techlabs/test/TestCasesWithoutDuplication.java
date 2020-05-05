package com.techlabs.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.techlabs.model.Game;

class TestCasesWithoutDuplication {
	Game game = new Game();
	int lowGuess = game.getRandomNum() - 1;
	int highGuess = game.getRandomNum() + 1;
	int correctGuess = game.getRandomNum();
	
	@Before
	public void runBeforeClass() {
		game.generateNum();
	}

	@Test
	void test_ToCheckWhetherGenerateNumberMethodWorks() {
		assertEquals(game.getRandomNum() >= 0 && game.getRandomNum() <= 100, true);
	}
	
	@Test
	void test_ToCheckWorkingOfCheckGuessMethodForLowGuess() {
		assertEquals(game.checkGuess(lowGuess), 0);
	}
	
	@Test
	void test_ToCheckWorkingOfCheckGuessMethodForHighGuess() {
		assertEquals(game.checkGuess(highGuess), 2);
	}
	
	@Test
	void test_ToCheckWorkingOfCheckGuessMethodForCorrectGuess() {
		assertEquals(game.checkGuess(correctGuess), 1);
	}
}
