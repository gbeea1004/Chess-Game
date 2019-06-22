package domain.chess;

import domain.pieces.Piece;

import java.util.ArrayList;
import java.util.List;

import static utils.StringUtils.*;

public class Board {
    private List<Piece> whitePieces = new ArrayList<>();
    private List<Piece> blackPieces = new ArrayList<>();

    public void addWhitePawn(Piece piece) {
        whitePieces.add(piece);
    }

    public void addBlackPawn(Piece piece) {
        blackPieces.add(piece);
    }

    public int size() {
        return whitePieces.size() + blackPieces.size();
    }

    public Piece findWhitePawn(int index) {
        return whitePieces.get(index);
    }

    public Piece findBlackPawn(int index) {
        return blackPieces.get(index);
    }

    public void initialize() {
        for (int i = 0; i < 8; i++) {
            addWhitePawn(Piece.createWhitePawn());
            addBlackPawn(Piece.createBlackPawn());
        }
    }

    public String getWhitePawnsResult() {
        return getPawnsResult(whitePieces);
    }

    public String getBlackPawnsResult() {
        return getPawnsResult(blackPieces);
    }

    private String getPawnsResult(List<Piece> pieces) {
        StringBuilder sb = new StringBuilder();
        for (Piece piece : pieces) {
            sb.append(piece.getRepresentation());
        }
        return sb.toString();
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append(appendNewLine(getBlankLine()));
        sb.append(appendNewLine(getBlackPawnsResult()));
        sb.append(appendNewLine(getBlankLine()));
        sb.append(appendNewLine(getBlankLine()));
        sb.append(appendNewLine(getBlankLine()));
        sb.append(appendNewLine(getBlankLine()));
        sb.append(appendNewLine(getWhitePawnsResult()));
        sb.append(getBlankLine());
        return sb.toString();
    }

    private String getBlankLine() {
        return "........";
    }
}
