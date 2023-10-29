package baseball;

import java.util.Scanner;

public interface InputView {

    Scanner sc = new Scanner(System.in);

    Integer getNumber();

    Integer getStartOrEnd();

    public static String read() {
        return sc.nextLine();
    }
}
