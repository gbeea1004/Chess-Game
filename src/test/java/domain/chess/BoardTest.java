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
        String blank = appendNewLine("........");
        assertThat(board.showBoard()).isEqualTo(
                appendNewLine("rnbqkbnr") +
                appendNewLine("pppppppp") +
                blank + blank + blank + blank +
                appendNewLine("PPPPPPPP") +
                appendNewLine("RNBQKBNR")
        );
    }

    @Test
    public void print() {
        board.initialize();
        System.out.println(board.showBoard());
    }
}
