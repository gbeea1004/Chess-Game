package domain.chess;

import domain.pieces.Piece;

import java.util.ArrayList;
import java.util.List;

public class Rank {
    private static final int SIZE = 8;
    private List<Piece> pieces = new ArrayList<>();

    public void addPiece(Piece piece) {
        if (pieces.size() > SIZE) {
            throw new IllegalArgumentException("Rank 사이즈를 초과했습니다.");
        }
        pieces.add(piece);
    }

    static Rank initializeWhitePieces() {
        Rank rank = new Rank();
        rank.addPiece(Piece.createWhite(Piece.Type.ROOK));
        rank.addPiece(Piece.createWhite(Piece.Type.KNIGHT));
        rank.addPiece(Piece.createWhite(Piece.Type.BISHOP));
        rank.addPiece(Piece.createWhite(Piece.Type.QUEEN));
        rank.addPiece(Piece.createWhite(Piece.Type.KING));
        rank.addPiece(Piece.createWhite(Piece.Type.BISHOP));
        rank.addPiece(Piece.createWhite(Piece.Type.KNIGHT));
        rank.addPiece(Piece.createWhite(Piece.Type.ROOK));
        return rank;
    }

    static Rank initializeBlackPieces() {
        Rank rank = new Rank();
        rank.addPiece(Piece.createBlack(Piece.Type.ROOK));
        rank.addPiece(Piece.createBlack(Piece.Type.KNIGHT));
        rank.addPiece(Piece.createBlack(Piece.Type.BISHOP));
        rank.addPiece(Piece.createBlack(Piece.Type.QUEEN));
        rank.addPiece(Piece.createBlack(Piece.Type.KING));
        rank.addPiece(Piece.createBlack(Piece.Type.BISHOP));
        rank.addPiece(Piece.createBlack(Piece.Type.KNIGHT));
        rank.addPiece(Piece.createBlack(Piece.Type.ROOK));
        return rank;
    }

    static Rank initializeWhitePawns() {
        Rank rank = new Rank();
        for (int i = 0; i < SIZE; i++) {
            rank.addPiece(Piece.createWhite(Piece.Type.PAWN));
        }
        return rank;
    }

    static Rank initializeBlackPawns() {
        Rank rank = new Rank();
        for (int i = 0; i < SIZE; i++) {
            rank.addPiece(Piece.createBlack(Piece.Type.PAWN));
        }
        return rank;
    }

    static Rank initializeBlankLine() {
        Rank rank = new Rank();
        for (int i = 0; i < SIZE; i++) {
            rank.addPiece(Piece.createBlank());
        }
        return rank;
    }

    public Piece findPiece(int index) {
        return pieces.get(index);
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public Piece getXPos(int xPos) {
        return pieces.get(xPos);
    }
}
