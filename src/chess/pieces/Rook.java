package chess.pieces;

import board.GameBoard;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece{

	public Rook(GameBoard board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "R";
	}

}
