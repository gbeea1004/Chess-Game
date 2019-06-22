package domain.chess;

import domain.pieces.Pawn;
import utils.StringUtils;

import java.util.ArrayList;
import java.util.List;

import static utils.StringUtils.*;

public class Board {
    private List<Pawn> whitePawns = new ArrayList<>();
    private List<Pawn> blackPawns = new ArrayList<>();

    public void addWhitePawn(Pawn pawn) {
        whitePawns.add(pawn);
    }

    public void addBlackPawn(Pawn pawn) {
        blackPawns.add(pawn);
    }

    public int size() {
        return whitePawns.size() + blackPawns.size();
    }

    public Pawn findWhitePawn(int index) {
        return whitePawns.get(index);
    }

    public Pawn findBlackPawn(int index) {
        return blackPawns.get(index);
    }

    public void initialize() {
        for (int i = 0; i < 8; i++) {
            addWhitePawn(new Pawn(Pawn.WHITE_COLOR, Pawn.WHITE_PAWN));
            addBlackPawn(new Pawn(Pawn.BLACK_COLOR, Pawn.BLACK_PAWN));
        }
    }

    public String getWhitePawnsResult() {
        return getPawnsResult(whitePawns);
    }

    public String getBlackPawnsResult() {
        return getPawnsResult(blackPawns);
    }

    private String getPawnsResult(List<Pawn> pawns) {
        StringBuilder sb = new StringBuilder();
        for (Pawn pawn : pawns) {
            sb.append(pawn.getRepresentation());
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
