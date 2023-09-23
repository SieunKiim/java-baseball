package baseball;

import java.util.Scanner;

public class InputView {

    Scanner sc = new Scanner(System.in);

    public Integer getNumber() {
        return Util.parseToInteger(read());
    }

    private String read() {
        return sc.nextLine();
    }
}
