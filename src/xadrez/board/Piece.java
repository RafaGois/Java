package xadrez.board;

public abstract class Piece {

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

    public abstract boolean [][] possibleMovies ();
    public boolean possibleMovie (Position position) {
        return possibleMovies()[position.row][position.column];
    }

    public boolean isThereAnyPossibleMove () {
        boolean[][]mat = possibleMovies();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0;j < mat.length; j++) {
                if (mat[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
