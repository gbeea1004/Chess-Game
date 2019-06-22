package domain.chess;

import domain.pieces.Piece;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BoardTest {
    private Board board;

    @Before
    public void setUp() throws Exception {
        board = new Board();
    }

    @Test
    public void create() {
        Piece white = Piece.createWhitePawn();
        board.addWhitePawn(white);
        assertThat(board.size()).isEqualTo(1);
        assertThat(board.findWhitePawn(0)).isEqualTo(white);

        Piece black = Piece.createBlackPawn();
        board.addBlackPawn(black);
        assertThat(board.size()).isEqualTo(2);
        assertThat(board.findBlackPawn(0)).isEqualTo(black);
    }

    @Test
    public void initialize() {
        board.initialize();
        assertThat(board.getWhitePawnsResult()).isEqualTo("pppppppp");
        assertThat(board.getBlackPawnsResult()).isEqualTo("PPPPPPPP");
    }

    @Test
    public void print() {
        board.initialize();
        assertThat(board.print()).isEqualTo(
                "........" + System.lineSeparator() +
                "PPPPPPPP" + System.lineSeparator() +
                "........" + System.lineSeparator() +
                "........" + System.lineSeparator() +
                "........" + System.lineSeparator() +
                "........" + System.lineSeparator() +
                "pppppppp" + System.lineSeparator() +
                "........");
    }
}
