package tdd.implementation;

public class Cell {
	private Mark mark;
	private CellPosition position;
	
	public Cell( CellPosition position) {
		this.position=position;
	}
	
	public CellPosition getCellPosition() {
		return position;
	}
	
	public Mark getMark() {
		return mark;
	}

	public void setMark(Mark mark) {
		if (this.mark == Mark.X || this.mark == Mark.O) {
			throw new RuntimeException("This Position is occupied ");
		}
		this.mark = mark;
	}

}
