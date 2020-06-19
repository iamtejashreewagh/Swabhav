package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.techlabs.model.Board;
import com.techlabs.model.Game;
import com.techlabs.model.Mark;
import com.techlabs.model.Player;
import com.techlabs.model.ResultAnalyzer;

class GameTest {

	@Test
	void test_ifPlayerIsSwapped() {

		Player[] players = new Player[2];
		players[0] = new Player("Pawan", Mark.O);
		players[1] = new Player("Amit", Mark.X);

		Board board = new Board();
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board);

		Game game = new Game(players, board, resultAnalyzer);

		game.play(5);

		assertEquals(players[1], game.getCurrentPlayer());

	}

	@Test
	void test_IfCorrectStatusIsReturned() {

		Player[] players = new Player[2];
		players[0] = new Player("Pawan", Mark.O);
		players[1] = new Player("Amit", Mark.X);

		Board board = new Board();
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board);

		Game game = new Game(players, board, resultAnalyzer);

		game.play(5);

		assertEquals("In Progress", game.getStatus());

	}

}
