package domain.chess;

import domain.pieces.Pawn;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BoardTest {
    @Test
    public void create() {
        Board board = new Board();

        Pawn white = new Pawn(Pawn.WHITE_COLOR);
        board.add(white);
        assertThat(board.size()).isEqualTo(1);
        assertThat(board.findPawn(0)).isEqualTo(Pawn.WHITE_COLOR);

        Pawn black = new Pawn(Pawn.BLACK_COLOR);
        board.add(black);
        assertThat(board.size()).isEqualTo(2);
        assertThat(board.findPawn(1)).isEqualTo(Pawn.BLACK_COLOR);
    }
}
