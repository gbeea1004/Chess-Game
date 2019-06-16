package domain.pieces;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PawnTest {
    @Test
    public void create() {
        verifyPawn(Pawn.WHITE_COLOR);
        verifyPawn(Pawn.BLACK_COLOR);
    }

    private void verifyPawn(final String color) {
        Pawn pawn = new Pawn(color);
        assertThat(pawn.getColor()).isEqualTo(color);
    }

    @Test
    public void create_기본생성자() {
        Pawn pawn = new Pawn();
        assertThat(pawn.getColor()).isEqualTo(Pawn.WHITE_COLOR);
    }
}
