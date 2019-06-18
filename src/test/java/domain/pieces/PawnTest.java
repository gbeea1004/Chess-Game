package domain.pieces;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PawnTest {
    @Test
    public void create() {
        verifyPawn(Pawn.WHITE_COLOR, Pawn.WHITE_PAWN);
        verifyPawn(Pawn.BLACK_COLOR, Pawn.BLACK_PAWN);
    }

    private void verifyPawn(final String color, final char representation) {
        Pawn pawn = new Pawn(color, representation);
        assertThat(pawn.getColor()).isEqualTo(color);
        assertThat(pawn.getRepresentation()).isEqualTo(representation);
    }

    @Test
    public void create_기본생성자() {
        Pawn pawn = new Pawn();
        assertThat(pawn.getColor()).isEqualTo(Pawn.WHITE_COLOR);
        assertThat(pawn.getRepresentation()).isEqualTo(Pawn.WHITE_PAWN);
    }
}
