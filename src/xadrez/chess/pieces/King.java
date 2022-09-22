package xadrez.chess.pieces;

import xadrez.board.Board;
import xadrez.chess.ChessPiece;
import xadrez.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }

    @Override
    public boolean[][] possibleMovies() {
        boolean [][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return new boolean[0][];
    }
}
