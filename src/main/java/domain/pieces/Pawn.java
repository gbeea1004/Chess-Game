package domain.pieces;

public class Pawn {
    public static final String WHITE_COLOR = "white";
    public static final String BLACK_COLOR = "black";

    private String color;

    public Pawn(String white) {
        color = white;
    }

    public Pawn() {
        color = WHITE_COLOR;
    }

    public String getColor() {
        return color;
    }
}
