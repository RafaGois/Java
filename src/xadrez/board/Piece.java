package xadrez.board;

public class Piece {

    protected Position position;
    private Board board;

    public Piece( Board board) {
        this.position = null;
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}
