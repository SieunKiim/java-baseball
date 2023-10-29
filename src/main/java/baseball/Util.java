package baseball;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Util {

    public static Integer parseToInteger(String s) {
        return Integer.parseInt(s);
    }

    public static String[] parseToStringArr(Integer a) {
        return String.valueOf(a).split("");
    }

    public static List<Integer> toIntegerList(Integer n) {
        String[] strings = Util.parseToStringArr(n);
        return Arrays.stream(strings).map(Integer::parseInt).collect(Collectors.toList());
    }
}
