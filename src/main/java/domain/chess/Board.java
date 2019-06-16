package domain.chess;

import domain.pieces.Pawn;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Pawn> pawns = new ArrayList<>();

    public void add(Pawn pawn) {
        pawns.add(pawn);
    }

    public int size() {
        return pawns.size();
    }

    public String findPawn(int index) {
        return pawns.get(index).getColor();
    }
}