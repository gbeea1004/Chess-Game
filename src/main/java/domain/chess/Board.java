package domain.chess;

import domain.pieces.Piece;

import java.util.ArrayList;
import java.util.List;

import static utils.StringUtils.appendNewLine;

public class Board {
    private static int pieceCount = 0;

    private List<Piece> whitePieces = new ArrayList<>();
    private List<Piece> blackPieces = new ArrayList<>();
    private List<Piece> whitePawns = new ArrayList<>();
    private List<Piece> blackPawns = new ArrayList<>();

    public void addWhitePiece(Piece piece) {
        whitePieces.add(piece);
        pieceCount++;
    }

    public void addBlackPiece(Piece piece) {
        blackPieces.add(piece);
        pieceCount++;
    }

    public void addWhitePawn(Piece pawn) {
        whitePawns.add(pawn);
        pieceCount++;
    }

    public void addBlackPawn(Piece pawn) {
        blackPawns.add(pawn);
        pieceCount++;
    }

    public int pieceCount() {
        return pieceCount;
    }

    public Piece findWhitePawn(int index) {
        return whitePieces.get(index);
    }

    public Piece findBlackPawn(int index) {
        return blackPieces.get(index);
    }

    public void initialize() {
        addWhitePawn(Piece.createWhite(Piece.Type.ROOK));
        addWhitePawn(Piece.createWhite(Piece.Type.KNIGHT));
        addWhitePawn(Piece.createWhite(Piece.Type.BISHOP));
        addWhitePawn(Piece.createWhite(Piece.Type.QUEEN));
        addWhitePawn(Piece.createWhite(Piece.Type.KING));
        addWhitePawn(Piece.createWhite(Piece.Type.BISHOP));
        addWhitePawn(Piece.createWhite(Piece.Type.KNIGHT));
        addWhitePawn(Piece.createWhite(Piece.Type.ROOK));

        for (int i = 0; i < 8; i++) {
            addWhitePawn(Piece.createWhite(Piece.Type.PAWN));
        }

        for (int i = 0; i < 8; i++) {
            addBlackPawn(Piece.createBlack(Piece.Type.PAWN));
        }

        addWhitePawn(Piece.createBlack(Piece.Type.ROOK));
        addWhitePawn(Piece.createBlack(Piece.Type.KNIGHT));
        addWhitePawn(Piece.createBlack(Piece.Type.BISHOP));
        addWhitePawn(Piece.createBlack(Piece.Type.QUEEN));
        addWhitePawn(Piece.createBlack(Piece.Type.KING));
        addWhitePawn(Piece.createBlack(Piece.Type.BISHOP));
        addWhitePawn(Piece.createBlack(Piece.Type.KNIGHT));
        addWhitePawn(Piece.createBlack(Piece.Type.ROOK));
    }

    public String getWhitePiecesResult() {
        return getPieceResult(whitePieces);
    }

    public String getBlackPiecesResult() {
        return getPieceResult(blackPieces);
    }

    public String getWhitePawnsResult() {
        return getPieceResult(whitePawns);
    }

    public String getBlackPawnsResult() {
        return getPieceResult(blackPawns);
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
        sb.append(appendNewLine(getBlackPiecesResult()));
        sb.append(appendNewLine(getBlackPawnsResult()));
        sb.append(blankLine);
        sb.append(blankLine);
        sb.append(blankLine);
        sb.append(blankLine);
        sb.append(appendNewLine(getWhitePawnsResult()));
        sb.append(appendNewLine(getWhitePiecesResult()));
        return sb.toString();
    }

    private String getBlankLine() {
        return "........";
    }
}
