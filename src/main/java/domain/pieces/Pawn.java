package domain.pieces;

public class Pawn {
    public static final String WHITE_COLOR = "white";
    public static final String BLACK_COLOR = "black";
    public static final char BLACK_PAWN = 'P';
    public static final char WHITE_PAWN = 'p';

    private String color;
    private char representation;

    public Pawn() {
        this(WHITE_COLOR, WHITE_PAWN);
    }

    public Pawn(String color, char representation) {
        this.color = color;
        this.representation = representation;
    }

    public String getColor() {
        return color;
    }

    public char getRepresentation() {
        return representation;
    }
}
