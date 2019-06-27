package domain.chess;

import domain.pieces.Piece;
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

    @Test
    public void countOfPiece() {
        board.initialize();
        assertThat(board.countOfPiece(Piece.createWhite(Piece.Type.ROOK))).isEqualTo(2);
        assertThat(board.countOfPiece(Piece.createWhite(Piece.Type.KNIGHT))).isEqualTo(2);
        assertThat(board.countOfPiece(Piece.createWhite(Piece.Type.BISHOP))).isEqualTo(2);
        assertThat(board.countOfPiece(Piece.createWhite(Piece.Type.KING))).isEqualTo(1);
        assertThat(board.countOfPiece(Piece.createWhite(Piece.Type.QUEEN))).isEqualTo(1);
        assertThat(board.countOfPiece(Piece.createWhite(Piece.Type.PAWN))).isEqualTo(8);

        assertThat(board.countOfPiece(Piece.createBlank())).isEqualTo(32);

        assertThat(board.countOfPiece(Piece.createBlack(Piece.Type.PAWN))).isEqualTo(8);
        assertThat(board.countOfPiece(Piece.createBlack(Piece.Type.ROOK))).isEqualTo(2);
        assertThat(board.countOfPiece(Piece.createBlack(Piece.Type.KNIGHT))).isEqualTo(2);
        assertThat(board.countOfPiece(Piece.createBlack(Piece.Type.BISHOP))).isEqualTo(2);
        assertThat(board.countOfPiece(Piece.createBlack(Piece.Type.KING))).isEqualTo(1);
        assertThat(board.countOfPiece(Piece.createBlack(Piece.Type.QUEEN))).isEqualTo(1);
        assertThat(board.countOfPiece(Piece.createBlack(Piece.Type.PAWN))).isEqualTo(8);
    }
}
