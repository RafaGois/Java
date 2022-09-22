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
        if (!positionExists(rows, column)) {
            throw new BoardException("Board n existe");
        }
        return pieces[rows][column];
    }

    public Piece piece (Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Fora do tamanho do board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece (Piece piece,Position position){
        if (thereIsAPiece(position)) {
            throw new BoardException("Ja tem peca aq vacilao");
        }
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

    public Piece removePiece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Position not on the board");
        }
        if (piece(position) == null) {
            return null;
        }
        Piece aux = piece(position);
        aux.position = null;
        pieces[position.getRow()][position.getColumn()] = null;
        return aux;
    }
}
