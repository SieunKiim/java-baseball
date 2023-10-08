package baseball;

import java.util.HashMap;
import java.util.List;

public class AnswerNum {
    private final List<Integer> answer;

    public AnswerNum(Integer n) {
        this.answer = Util.toIntegerList(n);
    }
    public HashMap<String, Integer> compare(Integer num) {
        HashMap<String, Integer> result = initCompareResult();
        List<Integer> integerList = Util.toIntegerList(num);
        countUpStrikeAndBall(result, integerList);
        return result;
    }

    public List<Integer> getAnswer(){
        return this.answer;
    }

    private HashMap<String, Integer> initCompareResult(){
        HashMap<String, Integer> result = new HashMap<>();
        result.put("s", 0);
        result.put("b", 0);
        return result;
    }

    private void countUpStrikeAndBall(HashMap<String, Integer> map, List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            String temp = getStrikeAndBall(i, arr.get(i));
            map.put(temp, map.getOrDefault(temp, 0)+ 1);
        }
    }

    private String getStrikeAndBall(Integer index, Integer n) {
        if (!answer.contains(n)) {
            return null;
        }
        if (!answer.get(index).equals(n)) {
            return "b";
        }
        return "s";
    }
}
