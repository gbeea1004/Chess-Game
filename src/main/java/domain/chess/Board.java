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
        addWhitePiece(Piece.createWhiteRook());
        addWhitePiece(Piece.createWhiteKnight());
        addWhitePiece(Piece.createWhiteBishop());
        addWhitePiece(Piece.createWhiteQueen());
        addWhitePiece(Piece.createWhiteKing());
        addWhitePiece(Piece.createWhiteBishop());
        addWhitePiece(Piece.createWhiteKnight());
        addWhitePiece(Piece.createWhiteRook());

        for (int i = 0; i < 8; i++) {
            addWhitePawn(Piece.createWhitePawn());
        }

        for (int i = 0; i < 8; i++) {
            addBlackPawn(Piece.createBlackPawn());
        }

        addBlackPiece(Piece.createBlackRook());
        addBlackPiece(Piece.createBlackKnight());
        addBlackPiece(Piece.createBlackBishop());
        addBlackPiece(Piece.createBlackQueen());
        addBlackPiece(Piece.createBlackKing());
        addBlackPiece(Piece.createBlackBishop());
        addBlackPiece(Piece.createBlackKnight());
        addBlackPiece(Piece.createBlackRook());
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
