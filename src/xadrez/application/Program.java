package xadrez.application;

import xadrez.board.Position;
import xadrez.chess.ChessException;
import xadrez.chess.ChessMatch;
import xadrez.chess.ChessPiece;
import xadrez.chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ChessMatch chessMatch = new ChessMatch();

        while (true) {

            try {
                UI.clear();

                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.println("Informe a posicao de origem");
                ChessPosition source = UI.readChessPosition(sc);

                System.out.println();
                System.out.println("Destino:");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.performChessMove(source,target);
            } catch (ChessException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            } catch (InputMismatchException i) {
                System.out.println(i.getMessage());
                sc.nextLine();
            }
        }
    }
}
