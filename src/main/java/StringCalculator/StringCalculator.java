package StringCalculator;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class StringCalculator {

    private Set<String> operator = new HashSet<>(List.of(new String[]{"+", "-", "*", "/"}));

    private final Scanner scanner = new Scanner(System.in);
    private final String[] raw;
    private final List<Integer> numbers = new ArrayList<>();
    private final List<String> operators = new ArrayList<>();

    public StringCalculator() {
        this.raw = parser(input());
        initCalculator();
    }

    public String input() {
        return scanner.nextLine();
    }

    public String[] parser(String s) {
        return s.split(" ");
    }

    public void initCalculator() {
        for (String s : raw) {
            inputClassifier(s);
        }
    }

    public void inputClassifier(String s) {
        if (operator.contains(s)) {
            operators.add(s);
            return;
        }
        numbers.add(Integer.parseInt(s));
    }

    public int calculate() {
        int result = numbers.get(0);
        for (int i = 0; i < operators.size(); i++) {
            result = operate(operators.get(i), result, numbers.get(i + 1));
        }
        return result;
    }

    public String[] getRaw() {
        return this.raw;
    }

    private int operate(String op, int a, int b) {
        if (op.equals("+")) {
            return plus(a, b);
        } else if (op.equals("-")) {
            return minus(a, b);
        } else if (op.equals("*")) {
            return multi(a, b);
        }
        return divide(a, b);
    }

    private int plus(int a, int b) {
        return a + b;
    }

    private int minus(int a, int b) {
        return a - b;
    }

    private int multi(int a, int b) {
        return a * b;
    }

    private int divide(int a, int b) {
        return a / b;
    }
}
