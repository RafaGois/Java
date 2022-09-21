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
        return "Hook{" +
                "position=" + position +
                '}';
    }
}
