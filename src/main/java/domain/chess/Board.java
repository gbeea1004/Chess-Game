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
        ListIterator<Rank> ranksIter = ranks.listIterator(ranks.size());
        while (ranksIter.hasPrevious()) {
            sb.append(showRank(ranksIter.previous()));
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

    public int countOfPiece(Piece piece) {
        int count = 0;
        for (Rank rank : ranks) {
            count += rank.getPieces().stream()
                    .filter(t -> t.getColor().equals(piece.getColor()))
                    .filter(t -> t.getRepresentation() == piece.getRepresentation())
                    .count();
        }
        return count;
    }

    public Piece findPiece(String piece) {
        int xPos = piece.charAt(0) - 'a';
        int y = piece.charAt(1) - '0';
        return ranks.get(y - 1).getPieces().get(xPos);
    }
}
