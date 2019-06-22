package domain.pieces;

public class Piece {
    public static final String WHITE_COLOR = "white";
    public static final String BLACK_COLOR = "black";
    public static final char BLACK_PAWN_REPRESENTATION = 'P';
    public static final char WHITE_PAWN_REPRESENTATION = 'p';

    private String color;
    private char representation;

    private Piece(String color, char representation) {
        this.color = color;
        this.representation = representation;
    }

    public static Piece createWhitePawn() {
        return new Piece(WHITE_COLOR, WHITE_PAWN_REPRESENTATION);
    }

    public static Piece createBlackPawn() {
        return new Piece(BLACK_COLOR, BLACK_PAWN_REPRESENTATION);
    }

    public String getColor() {
        return color;
    }

    public char getRepresentation() {
        return representation;
    }
}
