package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.model.Board;
import com.techlabs.model.Mark;
import com.techlabs.model.ResultAnalyzer;

class ResultAnalyzerTest {
	@Test
	void test_checkIfWinIsReturned() {
		Mark mark = Mark.X;
		Board board = new Board();
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board);
		resultAnalyzer.setMark(mark);
		board.markCell(0, mark);
		board.markCell(1, mark);
		board.markCell(2, mark);
		assertEquals("WIN", resultAnalyzer.analyzeResult());
	}

	@Test
	void test_checkIfInProgressIsReturned() {
		Mark mark = Mark.X;
		Board board = new Board();
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board);
		resultAnalyzer.setMark(mark);
		board.markCell(0, mark);

		board.markCell(1, mark);
		assertEquals("In Progress", resultAnalyzer.analyzeResult());
	}

	@Test
	void test_checkIfColmnIsCheckedPerfectly() {
		Mark mark = Mark.X;
		Board board = new Board();
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board);
		resultAnalyzer.setMark(mark);
		board.markCell(0, mark);
		board.markCell(3, mark);
		board.markCell(6, mark);

		assertEquals(true, resultAnalyzer.checkColumn());
	}

	@Test
	void test_checkIfRowIsCheckedPerfectly() {
		Mark mark = Mark.X;
		Board board = new Board();
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board);
		resultAnalyzer.setMark(mark);
		board.markCell(0, mark);
		board.markCell(1, mark);
		board.markCell(2, mark);
		assertEquals(true, resultAnalyzer.checkRow());
	}

	@Test
	void test_checkIfDiagonalIsCheckedPerfectly() {
		Mark mark = Mark.X;
		Board board = new Board();
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board);
		resultAnalyzer.setMark(mark);
		board.markCell(0, mark);
		board.markCell(4, mark);
		board.markCell(8, mark);
		assertEquals(true, resultAnalyzer.checkdiagonal());
	}
}