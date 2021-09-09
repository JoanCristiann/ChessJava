package board;

import java.util.List;

public class GameBoard {
	
	private int row;
	private int column;	
	private Piece [][] pieces;
	
	public GameBoard(int row, int column) {
		this.row = row;
		this.column = column;
		pieces = new Piece[row][column];
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	
	
	
	
	

}
