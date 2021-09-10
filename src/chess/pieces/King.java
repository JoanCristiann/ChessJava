package chess.pieces;

import board.GameBoard;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{

	public King(GameBoard board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "K";
	}

}
