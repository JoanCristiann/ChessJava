package board;

public class Piece {
	
	protected Position position;
	private GameBoard board;
	
	public Piece() {		
	}

	public Piece(GameBoard board) {
		this.board = board;
		position = null;
	}
	
	protected GameBoard getBoard() {
		return board;
	}
	
	//public Piece[][] possibleMoves() {
		//return Piece[this.position.getRow()][this.position.getColumn()];
	//}
	public boolean possibleMove(Position position) {
		return true;
	}
	public boolean isThereAnyPossibleMove() {
		return true;
	}

}
