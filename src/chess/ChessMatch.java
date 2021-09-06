package chess;

import boardgame.Board;


public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8,8);
	}
	
	public ChessPiece[][] getPieces() {
		//criando matriz
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		//percorrer a matriz de peça do tabuleiro (board)
		//para cada peça do tabuleiro, fazer um downCasting para ChessPiece
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		//retorna a matriz de peças, da partida de xadrez
		return mat;
		
		
		
		
		
		
	}

}
