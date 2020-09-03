package chess;

import boardGame_Tabuleiro.Board;
import boardGame_Tabuleiro.Piece;

public class ChessPiece extends Piece {
	private Color color;
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	
}
