import domain.chess.Board;
import view.InputView;
import view.ResultView;

import java.util.Scanner;

public class ChessGameApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (InputView.isGameStart(scanner)) {
            Board board = new Board();
            board.initialize();
            ResultView.showBoard(board);
        }
        scanner.close();
    }
}
