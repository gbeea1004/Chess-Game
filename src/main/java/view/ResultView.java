package view;

import domain.chess.Board;

public class ResultView {
    public static void showBoard(Board board) {
        System.out.println(board.print());
    }
}
