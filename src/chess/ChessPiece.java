package chess;

import board.GameBoard;
import board.Piece;

public class ChessPiece extends Piece{
	
	private Color color;
	private int moveCount;
	
	public ChessPiece(GameBoard board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	

}
