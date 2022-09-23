package xadrez.chess;

import xadrez.board.Board;
import xadrez.board.Piece;
import xadrez.board.Position;
import xadrez.chess.pieces.Rook;
import xadrez.chess.pieces.King;

public class ChessMatch {

    private Board board;

    public ChessMatch () {
        board = new Board(8,8);
        inialSetup();
    }

    public ChessPiece[][] getPieces () {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for(int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return mat;
    }

    public boolean [][] possibleMovies (ChessPosition sourcePosition) {
        Position position = sourcePosition.toPosition();
        validateSourcePosition(position);
        return board.piece(position).possibleMovies();
    }

    public ChessPiece performChessMove (ChessPosition sourcePosition, ChessPosition targetPosition) {

        Position source = sourcePosition.toPosition();
        Position target = targetPosition.toPosition();

        validateSourcePosition(source);
        validateTergetPosition(source,target);

        Piece capturedPiece = makeMovie(source,target);

        return (ChessPiece) capturedPiece;
    }

    private Piece makeMovie(Position source, Position target) {
        Piece p = board.removePiece(source);
        Piece capturedPiece = board.removePiece(target);

        board.placePiece(p,target);

        return capturedPiece;
    }

    private void validateSourcePosition(Position source) {
        if (!board.thereIsAPiece(source)) {
            throw new ChessException("Nao existe peca na posicao selecionada");
        }
        if (!board.piece(source).isThereAnyPossibleMove()) {
            throw new ChessException("Nao pode mover a peca para aqui");
        }
    }

    private void validateTergetPosition (Position source, Position target ) {
         if (board.piece(source).possibleMovie(target)) {
             throw new ChessException("A peca escolhida não pode se mover para a posicao de destino");
         }
    }

    private void placeNewPiece (char column, int row,ChessPiece piece) {
        board.placePiece(piece,new ChessPosition(column, row).toPosition());
    }

    private void inialSetup () {
        placeNewPiece('c',2,new Rook(board,Color.WHITE));
        placeNewPiece('d',2,new Rook(board,Color.WHITE));
        placeNewPiece('e',2,new Rook(board,Color.WHITE));
        placeNewPiece('e',1,new Rook(board,Color.WHITE));
        placeNewPiece('c',1,new Rook(board,Color.WHITE));
        placeNewPiece('d',1,new King(board,Color.WHITE));

        placeNewPiece('c',7,new Rook(board,Color.BLACK));
        placeNewPiece('c',8,new Rook(board,Color.BLACK));
        placeNewPiece('d',7,new Rook(board,Color.BLACK));
        placeNewPiece('e',7,new Rook(board,Color.BLACK));
        placeNewPiece('e',8,new Rook(board,Color.BLACK));
        placeNewPiece('d',8,new King(board,Color.BLACK));
    }

}
