package xadrez.application;

import xadrez.board.Position;
import xadrez.chess.ChessMatch;

public class Program {

    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
