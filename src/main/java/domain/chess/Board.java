package domain.chess;

import domain.pieces.Piece;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import static utils.StringUtils.appendNewLine;

public class Board {
    private List<Rank> ranks = new ArrayList<>();

    public void initialize() {
        ranks.add(Rank.initializeWhitePieces());
        ranks.add(Rank.initializeWhitePawns());
        ranks.add(Rank.initializeBlankLine());
        ranks.add(Rank.initializeBlankLine());
        ranks.add(Rank.initializeBlankLine());
        ranks.add(Rank.initializeBlankLine());
        ranks.add(Rank.initializeBlackPawns());
        ranks.add(Rank.initializeBlackPieces());
    }

    public String showBoard() {
        StringBuilder sb = new StringBuilder();
        for (Rank rank : ranks) {
            sb.append(showRank(rank));
        }
        return sb.toString();
    }

    public String showRank(Rank rank) {
        StringBuilder sb = new StringBuilder();
        for (Piece piece : rank.getPieces()) {
            sb.append(piece.getRepresentation());
        }
        return appendNewLine(sb.toString());
    }
}
