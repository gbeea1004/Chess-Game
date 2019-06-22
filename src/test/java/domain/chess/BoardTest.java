package domain.chess;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static utils.StringUtils.appendNewLine;

public class BoardTest {
    private Board board;

    @Before
    public void setUp() throws Exception {
        board = new Board();
    }

    @Test
    public void create() {
        board.initialize();
        assertThat(board.pieceCount()).isEqualTo(32);
        String blank = appendNewLine("........");
        assertThat(board.showBoard()).isEqualTo(
                appendNewLine("RNBQKBNR") +
                appendNewLine("PPPPPPPP") +
                blank + blank + blank + blank +
                appendNewLine("pppppppp") +
                appendNewLine("rnbqkbnr")
        );
    }

    @Test
    public void print() {
        board.initialize();
        System.out.println(board.showBoard());
    }
}
