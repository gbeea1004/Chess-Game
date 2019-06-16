package domain;

public class Pawn {
    private String color;

    public Pawn(String white) {
        color = white;
    }

    public Pawn() {
        color = "white";
    }

    public String getColor() {
        return color;
    }
}
