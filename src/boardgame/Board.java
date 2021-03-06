package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1 )
			throw new BoardException("Erro ao criar tabuleiro: ? necess?rio haver pelo menos 1 linha e 1 coluna!");
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}


	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}
	
	public Piece piece(int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Posi??o n?o existe no tabuleiro.");
		}
		return pieces[row][column];
	}
	
	//sobrecarga do m?todo Piece 
	//retorna a pe?a pela posi??o
	//o if verifica se a posicao exite
	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Posi??o n?o existe no tabuleiro.");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("J? existe uma pe?a na posi??o " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	public Piece removePiece(Position position) {
		//programa??o defensiva
		if (!positionExists(position)) {
			throw new BoardException("Posi??o n?o existe no tabuleiro.");
		}
		if (piece(position) == null) {
			return null;
		}
		//variavel aux aponta para a pe?a que ser? removida
		Piece aux = piece(position);
		//retirando a pe?a do tabuleiro
		aux.position =  null;
		pieces[position.getRow()][position.getColumn()] = null;
		return aux;
	}
	
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Posi??o n?o existe no tabuleiro.");
		}
		return piece(position) != null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
