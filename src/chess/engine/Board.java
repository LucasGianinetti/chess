package chess.engine;

import chess.ChessController;
import chess.ChessView;
import chess.PieceType;
import chess.PlayerColor;

import java.util.List;

public class Board implements ChessController {

    public Square[][] getBoard() {
        return board;
    }

    private Square[][] board;
    private ChessView view;
    private final int BOARD_HEIGHT = 8;
    private final int BOARD_LENGTH = 8;
    private boolean whiteTurn;

    private List<Move> move;

    public Board(){
        this.board = new Square[BOARD_LENGTH][BOARD_HEIGHT];
    }

    public void newGame(){
        whiteTurn = true;
        initPieces();
    }

    private void initPieces(){
        for(int i = 0; i < BOARD_HEIGHT; i++){
            for(int j = 0; j < BOARD_LENGTH; j++){
                this.view.removePiece(i, j);
                board[i][j] = null;
            }
        }

        Piece kingW = new King(null, PlayerColor.WHITE, PieceType.KING);
        Piece kingB = new King(null, PlayerColor.BLACK, PieceType.KING);

        Piece queenW = new Queen(null, PlayerColor.WHITE,PieceType.QUEEN);
        Piece queenB = new Queen(null, PlayerColor.BLACK,PieceType.QUEEN);

        Piece bishopW1 = new Bishop(null, PlayerColor.WHITE,PieceType.BISHOP);
        Piece bishopW2 = new Bishop(null, PlayerColor.WHITE,PieceType.BISHOP);
        Piece bishopB1 = new Bishop(null, PlayerColor.BLACK,PieceType.BISHOP);
        Piece bishopB2 = new Bishop(null, PlayerColor.BLACK,PieceType.BISHOP);

        Piece rookW1 = new Rook(null, PlayerColor.WHITE,PieceType.ROOK);
        Piece rookW2 = new Rook(null, PlayerColor.WHITE,PieceType.ROOK);
        Piece rookB1 = new Rook(null, PlayerColor.BLACK,PieceType.ROOK);
        Piece rookB2 = new Rook(null, PlayerColor.BLACK,PieceType.ROOK);

        Piece knightW1 = new Knight(null, PlayerColor.WHITE,PieceType.KNIGHT);
        Piece knightW2 = new Knight(null, PlayerColor.WHITE,PieceType.KNIGHT);
        Piece knightB1 = new Knight(null, PlayerColor.BLACK,PieceType.KNIGHT);
        Piece knightB2 = new Knight(null, PlayerColor.BLACK,PieceType.KNIGHT);

        Piece pawnW1 = new Pawn(null, PlayerColor.WHITE,PieceType.PAWN);
        Piece pawnW2 = new Pawn(null, PlayerColor.WHITE,PieceType.PAWN);
        Piece pawnW3 = new Pawn(null, PlayerColor.WHITE,PieceType.PAWN);
        Piece pawnW4 = new Pawn(null, PlayerColor.WHITE,PieceType.PAWN);
        Piece pawnW5 = new Pawn(null, PlayerColor.WHITE,PieceType.PAWN);
        Piece pawnW6 = new Pawn(null, PlayerColor.WHITE,PieceType.PAWN);
        Piece pawnW7 = new Pawn(null, PlayerColor.WHITE,PieceType.PAWN);
        Piece pawnW8 = new Pawn(null, PlayerColor.WHITE,PieceType.PAWN);

        Piece pawnB1 = new Pawn(null, PlayerColor.BLACK,PieceType.PAWN);
        Piece pawnB2 = new Pawn(null, PlayerColor.BLACK,PieceType.PAWN);
        Piece pawnB3 = new Pawn(null, PlayerColor.BLACK,PieceType.PAWN);
        Piece pawnB4 = new Pawn(null, PlayerColor.BLACK,PieceType.PAWN);
        Piece pawnB5 = new Pawn(null, PlayerColor.BLACK,PieceType.PAWN);
        Piece pawnB6 = new Pawn(null, PlayerColor.BLACK,PieceType.PAWN);
        Piece pawnB7 = new Pawn(null, PlayerColor.BLACK,PieceType.PAWN);
        Piece pawnB8 = new Pawn(null, PlayerColor.BLACK,PieceType.PAWN);

        board[4][0] = new Square( kingW,4,0);
        kingW.move(board[4][0]);
        board[4][7] = new Square(kingB,4,7);
        kingB.move(board[4][7]);
        board[3][0] = new Square(queenW,3,0);
        queenW.move(board[3][0]);
        board[3][7] = new Square(queenB,3,7);
        queenB.move(board[3][7]);

        board[2][0] = new Square(bishopW1,2,0);
        bishopW1.move(board[2][0]);
        board[5][0] = new Square(bishopW2,5,0);
        bishopW2.move(board[5][0]);
        board[2][7] = new Square(bishopB1,2,7);
        bishopB1.move(board[2][7]);
        board[5][7] = new Square(bishopB2,5,7);
        bishopB2.move(board[5][7]);


        board[0][0] = new Square(rookW1,0,0);
        rookW1.move(board[0][0]);
        board[7][0] = new Square(rookW2,7,0);
        rookW2.move(board[7][0]);
        board[0][7] = new Square(rookB1,0,7);
        rookB1.move(board[0][7]);
        board[7][7] = new Square(rookB2,7,7);
        rookB2.move(board[7][7]);

        board[1][0] = new Square(knightW1,1,0);
        knightW1.move(board[1][0]);
        board[6][0] = new Square(knightW2,6,0);
        knightW2.move(board[6][0]);
        board[1][7] = new Square(knightB1,1,7);
        knightB1.move(board[1][7]);
        board[6][7] = new Square(knightB2,6,7);
        knightB2.move(board[6][7]);

        board[0][1] = new Square(pawnW1,0,1);
        pawnW1.move(board[0][1]);
        board[1][1] = new Square(pawnW2,1,1);
        pawnW2.move(board[1][1]);
        board[2][1] = new Square(pawnW3,2,1);
        pawnW3.move(board[2][1]);
        board[3][1] = new Square(pawnW4,3,1);
        pawnW4.move(board[3][1]);
        board[4][1] = new Square(pawnW5,4,1);
        pawnW5.move(board[4][1]);
        board[5][1] = new Square(pawnW6,5,1);
        pawnW6.move(board[5][1]);
        board[6][1] = new Square(pawnW7,6,1);
        pawnW7.move(board[6][1]);
        board[7][1] = new Square(pawnW8,7,1);
        pawnW8.move(board[7][1]);


        board[0][6] = new Square(pawnB1,0,6);
        pawnB1.move(board[0][6]);
        board[1][6] = new Square(pawnB2,1,6);
        pawnB2.move(board[1][6]);
        board[2][6] = new Square(pawnB3,2,6);
        pawnB3.move(board[2][6]);
        board[3][6] = new Square(pawnB4,3,6);
        pawnB4.move(board[3][6]);
        board[4][6] = new Square(pawnB5,4,6);
        pawnB5.move(board[4][6]);
        board[5][6] = new Square(pawnB6,5,6);
        pawnB6.move(board[5][6]);
        board[6][6] = new Square(pawnB7,6,6);
        pawnB7.move(board[6][6]);
        board[7][6] = new Square(pawnB8,7,6);
        pawnB8.move(board[7][6]);


        for(int i = 0; i < BOARD_LENGTH; i++){
            for(int j = 2; j < 6; j++){
                board[i][j] = new Square(null,i,j);
            }
        }

        for(int i = 0; i < BOARD_HEIGHT; i++){
            for(int j = 0; j < BOARD_LENGTH; j++){
                if(board[i][j].getPiece() != null){
                    this.view.putPiece(board[i][j].getPiece().getType(), board[i][j].getPiece().getColor(), i, j);
                }
            }
        }

    }

    @Override
    public void start(ChessView view) {
        this.view = view;
        view.startView();

        while(true){

        }
    }
    @Override
    public boolean move(int fromX, int fromY, int toX, int toY) {

        if(board[fromX][fromY].getPiece() == null){
            view.displayMessage("La casse est vide trou du cul.");
            return false;
        }

        Square from = board[fromX][fromY];
        Square to = board[toX][toY];

        if(whiteTurn){
            if(from.getPiece().getColor() == PlayerColor.BLACK){
                view.displayMessage("je suis pas un blanc bec");
                return false;
            }
        }else{
            if(from.getPiece().getColor() == PlayerColor.WHITE){
                view.displayMessage("je suis pas un trou du cul");
                return false;
            }
        }

        if(from.getPiece().isLegalMove(this,to)){
            System.out.println("OUAI LE MOVE EST LEGAL");
            this.view.removePiece(fromX, fromY);
            this.view.putPiece(from.getPiece().getType(), from.getPiece().getColor(), toX, toY);

            from.getPiece().move(to);
            to.setPiece(from.getPiece());
            from.removePiece();



            if(whiteTurn){
                whiteTurn = false;
            }else{
                whiteTurn = true;
            }

            return true;
        }else{
            return false;
        }
    }


}
