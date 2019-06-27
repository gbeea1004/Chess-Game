package domain.chess;

import domain.pieces.Piece;

import java.util.ArrayList;
import java.util.List;

import static utils.StringUtils.appendNewLine;

public class Board {
    private static int pieceCount = 0;
    private List<Rank> pieces = new ArrayList<>();

    public int pieceCount() {
        return pieceCount;
    }

    public void initialize() {
        pieces.add(Rank.initializeWhitePieces());
        pieces.add(Rank.initializeWhitePawns());
        pieces.add(Rank.initializeBlankLine());
        pieces.add(Rank.initializeBlankLine());
        pieces.add(Rank.initializeBlankLine());
        pieces.add(Rank.initializeBlankLine());
        pieces.add(Rank.initializeBlackPawns());
        pieces.add(Rank.initializeBlackPieces());
    }

    private String getPieceResult(List<Piece> pieces) {
        StringBuilder sb = new StringBuilder();
        for (Piece piece : pieces) {
            sb.append(piece.getRepresentation());
        }
        return sb.toString();
    }

    public String showBoard() {
        String blankLine = appendNewLine("........");
        StringBuilder sb = new StringBuilder();
        
        return sb.toString();
    }

    private String getBlankLine() {
        return "........";
    }
}
