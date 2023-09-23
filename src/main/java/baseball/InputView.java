package baseball;

import java.util.Scanner;

public class InputView {
    Scanner sc = new Scanner(System.in);

    public Integer getNumber(){
        System.out.print("숫자를 입력해 주세요 : ");
        return Util.parseToInteger(read());
    }

    public String read(){
        return sc.nextLine();
    }
}
