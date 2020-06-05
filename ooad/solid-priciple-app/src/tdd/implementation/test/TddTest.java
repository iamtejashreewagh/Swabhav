package tdd.implementation.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tdd.implementation.Cell;
import tdd.implementation.CellPosition;
import tdd.implementation.Mark;

class TddTest {
	
	Cell cell = new Cell(CellPosition.THIRD);
	
	@Test
	public void test_SetMark() {
		cell.setMark(Mark.O);
		assertEquals(Mark.O, cell.getMark());
	}

	@Test
	public void test_GetMark() {
		cell.setMark(Mark.X);
		assertEquals(Mark.X, cell.getMark());;
	}
	
	@Test
	public void test_GetPosition() {
		assertEquals(CellPosition.THIRD, cell.getCellPosition());
	}

}
