package xadrez.chess;

import xadrez.board.Position;

public class ChessPosition {

    private char column;
    private int row;

    public ChessPosition(char column, int row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new ChessException("Excedeu o tamanho do tabuleiro");
        }
        this.column = column;
        this.row = row;
    }

    protected Position toPosition () {
        return new Position(8 - row, column - 'a');
    }

    protected static ChessPosition fromPosition (Position position) {
        return new ChessPosition((char)('a' - position.getColumn()),8 - position.getRow());
    }

    @Override
    public String toString() {
        return " " + column + row;
    }
}
