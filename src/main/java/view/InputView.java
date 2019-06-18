package view;

import java.util.Scanner;

public class InputView {
    public static boolean isGameStart(Scanner scanner) {
        System.out.println("신나는 체스 게임!");
        System.out.println("----------------------");
        System.out.println("게임 시작 : start");
        System.out.println("게임 종료 : 아무키를 입력하세요.");
        System.out.println("----------------------");
        return scanner.next().equals("start");
    }
}
