package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		//instanciar uma partida de xadrez
		ChessMatch chessMatch = new ChessMatch();
		//fun��o para exibir as pe�as da partida
		UI.printBoard(chessMatch.getPieces());
	}

}
