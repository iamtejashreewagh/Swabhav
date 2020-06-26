package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.techlabs.model.Cell;
import com.techlabs.model.Mark;

class CellTestCase {
	
	@Test
	void checkIfMarkIsBeingSet() {
		Cell cell = new Cell();
		cell.setMark(Mark.O);
		
		assertEquals(Mark.O, cell.getMark());
	}

	@Test
	void checkIfMarkIsAvailabe() {
		Cell cell = new Cell();
		
		assertEquals(true, cell.checkIfCellAvailabe());
	}

	@Test
	void checkIfItIsBlankInStart() {
		Cell cell = new Cell();
		
		assertEquals(Mark.BLANK, cell.getMark());
	}
}
