package domain.pieces;

import org.junit.Test;

import static domain.pieces.Piece.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PieceTest {
    @Test
    public void create_piece() {
        verifyPiece(Piece.createWhitePawn(), Piece.createBlackPawn(), Type.PAWN);
        verifyPiece(Piece.createWhiteRook(), Piece.createBlackRook(), Type.ROOK);
        verifyPiece(Piece.createWhiteKnight(), Piece.createBlackKnight(), Type.KNIGHT);
        verifyPiece(Piece.createWhiteBishop(), Piece.createBlackBishop(), Type.BISHOP);
        verifyPiece(Piece.createWhiteQueen(), Piece.createBlackQueen(), Type.QUEEN);
        verifyPiece(Piece.createWhiteKing(), Piece.createBlackKing(), Type.KING);

        Piece blank = Piece.createBlank();
        assertThat(blank.isWhite()).isFalse();
        assertThat(blank.isBlack()).isFalse();
    }

    private void verifyPiece(final Piece whitePiece, final Piece blackPiece, final Type type) {
        assertThat(whitePiece.isWhite()).isTrue();
        assertThat(whitePiece.getRepresentation()).isEqualTo(type);

        assertThat(blackPiece.isBlack()).isTrue();
        assertThat(blackPiece.getRepresentation()).isEqualTo(type);
    }

    @Test
    public void isWhiteAndBlack() {
        assertThat(createWhiteKing().isWhite()).isTrue();
        assertThat(createWhiteKing().isBlack()).isFalse();

        assertThat(createBlackBishop().isBlack()).isTrue();
        assertThat(createBlackBishop().isWhite()).isFalse();
    }

    @Test
    public void getRepresentationPerPiece() {
        assertThat(Type.PAWN.getBlackRepresentation()).isEqualTo('P');
        assertThat(Type.PAWN.getWhiteRepresentation()).isEqualTo('p');
    }
}
