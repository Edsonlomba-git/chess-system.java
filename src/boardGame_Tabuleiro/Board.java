package boardGame_Tabuleiro;

public class Board {
	private Integer rows;
	private int columns;
	private Piece[][] pieces;
	
	/**********************	Constructors	******************************/
	public Board(Integer rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		this.pieces = new Piece[rows][columns];
	}
	
	/**********************	Encapsulation	******************************/
	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	
}
