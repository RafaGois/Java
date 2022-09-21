package xadrez.board;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {

        if (rows < 1 || columns < 1) {
            throw new BoardException("O tabuleito deve ter no mínimo uma linha e uma coluna");
        }
        this.rows = rows;
        this.columns = columns;
        this.pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Piece piece (int rows, int column) {
        return pieces[rows][column];
    }

    public Piece piece (Position position) {
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece (Piece piece,Position position){
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;

    }

    private boolean positionExists (int row, int column) {
        return row >= 0 && row <= rows && column >= 0 && column < columns;
    }

    public boolean positionExists (Position position) {
        return positionExists(position.getRow(), position.getColumn());
    }

    public boolean thereIsAPiece (Position position) {
        return piece(position) != null;
    }
}
