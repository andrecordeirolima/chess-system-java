package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//instanciar uma partida de xadrez
		ChessMatch chessMatch = new ChessMatch();
		while (true) {
		//função para exibir as peças da partida
		UI.printBoard(chessMatch.getPieces());
		System.out.println();
		System.out.print("Origem: ");
		ChessPosition source = UI.readChessPosition(sc);
		
		System.out.println();
		System.out.print("Destino: ");
		ChessPosition target = UI.readChessPosition(sc);
		
		ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		
		
	}
	}

}
