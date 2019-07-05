package domain.chess;

import domain.pieces.Piece;

import java.util.ArrayList;
import java.util.List;

public class Rank {
    private static final int SIZE = 8;
    private List<Piece> pieces = new ArrayList<>(8);

    static Rank initializeWhitePieces() {
        Rank rank = new Rank();
        rank.pieces.add(Piece.createWhite(Piece.Type.ROOK));
        rank.pieces.add(Piece.createWhite(Piece.Type.KNIGHT));
        rank.pieces.add(Piece.createWhite(Piece.Type.BISHOP));
        rank.pieces.add(Piece.createWhite(Piece.Type.QUEEN));
        rank.pieces.add(Piece.createWhite(Piece.Type.KING));
        rank.pieces.add(Piece.createWhite(Piece.Type.BISHOP));
        rank.pieces.add(Piece.createWhite(Piece.Type.KNIGHT));
        rank.pieces.add(Piece.createWhite(Piece.Type.ROOK));
        return rank;
    }

    static Rank initializeBlackPieces() {
        Rank rank = new Rank();
        rank.pieces.add(Piece.createBlack(Piece.Type.ROOK));
        rank.pieces.add(Piece.createBlack(Piece.Type.KNIGHT));
        rank.pieces.add(Piece.createBlack(Piece.Type.BISHOP));
        rank.pieces.add(Piece.createBlack(Piece.Type.QUEEN));
        rank.pieces.add(Piece.createBlack(Piece.Type.KING));
        rank.pieces.add(Piece.createBlack(Piece.Type.BISHOP));
        rank.pieces.add(Piece.createBlack(Piece.Type.KNIGHT));
        rank.pieces.add(Piece.createBlack(Piece.Type.ROOK));
        return rank;
    }

    static Rank initializeWhitePawns() {
        Rank rank = new Rank();
        for (int i = 0; i < SIZE; i++) {
            rank.pieces.add(Piece.createWhite(Piece.Type.PAWN));
        }
        return rank;
    }

    static Rank initializeBlackPawns() {
        Rank rank = new Rank();
        for (int i = 0; i < SIZE; i++) {
            rank.pieces.add(Piece.createBlack(Piece.Type.PAWN));
        }
        return rank;
    }

    static Rank initializeBlankLine() {
        Rank rank = new Rank();
        for (int i = 0; i < SIZE; i++) {
            rank.pieces.add(Piece.createBlank());
        }
        return rank;
    }

    public Piece findPiece(int index) {
        return pieces.get(index);
    }

    public List<Piece> getPieces() {
        return pieces;
    }
}
