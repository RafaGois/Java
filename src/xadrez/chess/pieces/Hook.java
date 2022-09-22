package xadrez.chess.pieces;

import xadrez.board.Board;
import xadrez.chess.ChessPiece;
import xadrez.chess.Color;

public class Hook extends ChessPiece {

    public Hook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "H";
    }

    @Override
    public boolean[][] possibleMovies() {
        boolean [][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return new boolean[0][];
    }
}
