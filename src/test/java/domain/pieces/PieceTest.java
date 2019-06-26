package domain.pieces;

import org.junit.Test;

import static domain.pieces.Piece.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PieceTest {
    @Test
    public void create_piece() {
        verifyPiece(createWhite(Type.PAWN), createBlack(Type.PAWN), Type.PAWN);
        verifyPiece(createWhite(Type.ROOK), createBlack(Type.ROOK), Type.ROOK);
        verifyPiece(createWhite(Type.KNIGHT), createBlack(Type.KNIGHT), Type.KNIGHT);
        verifyPiece(createWhite(Type.BISHOP), createBlack(Type.BISHOP), Type.BISHOP);
        verifyPiece(createWhite(Type.QUEEN), createBlack(Type.QUEEN), Type.QUEEN);
        verifyPiece(createWhite(Type.KING), createBlack(Type.KING), Type.KING);

        Piece blank = createBlank();
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
        assertThat(createWhite(Type.KING).isWhite()).isTrue();
        assertThat(createBlack(Type.KING).isBlack()).isTrue();
    }

    @Test
    public void getRepresentationPerPiece() {
        assertThat(Type.PAWN.getBlackRepresentation()).isEqualTo('P');
        assertThat(Type.PAWN.getWhiteRepresentation()).isEqualTo('p');
    }
}
