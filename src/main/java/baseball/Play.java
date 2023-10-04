package baseball;

import java.util.HashMap;

public class Play {

    private final InputView inputView = new InputView();
    private final ResultView resultView = new ResultView();
    private AnswerNum answerNum;

    public Play() {
        boolean play = true;
        while (play) {
            setAnswerNum();
            loop();
            play = askNextGame();
        }
    }

    public void play(){
        loop();

    }

    private void loop(){
        boolean flag = true;
        while (flag) {
            Integer num = getUserInput();
            HashMap<String, Integer> compareResult = answerNum.compare(num);
            printResult(compareResult);
            flag = isCorrect(compareResult);
        }
    }

    private boolean isCorrect(HashMap<String, Integer> compareResult) {
        if (compareResult.get("s") == 3) {
            return true;
        }
        return false;
    }

    private Integer getUserInput(){
        resultView.inputMessage();
        return inputView.getNumber();
    }

    private void printResult(HashMap<String, Integer> map) {
        resultView.outResult(map.get("s"), map.get("b"));
    }

    private void setAnswerNum(){
        answerNum = new AnswerNum(inputView.getNumber());
    }

    private boolean askNextGame(){
        resultView.endMessage();
        int op = inputView.getNumber();
        if (op == 1) {
            return true;
        }
        return false;
    }
}
