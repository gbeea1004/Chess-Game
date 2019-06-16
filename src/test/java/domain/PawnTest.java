package domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PawnTest {
    @Test
    public void create() {
        verifyPawn("white");
        verifyPawn("black");
    }

    private void verifyPawn(final String color) {
        Pawn pawn = new Pawn(color);
        assertThat(pawn.getColor()).isEqualTo(color);
    }
}
