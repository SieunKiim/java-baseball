package baseball;

public class ResultView {

    public void outResult(Integer s, Integer b) {
        if (s + b == 0) {
            System.out.println("낫싱");
            return;
        }
        System.out.println(getBallString(b) + getStrikeString(s));
    }

    private String getBallString(Integer b) {
        StringBuilder output = new StringBuilder();
        if (b != 0) {
            output.append(b).append("볼 ");
        }
        return output.toString();
    }

    private String getStrikeString(Integer s) {
        StringBuilder output = new StringBuilder();
        if (s != 0) {
            output.append(s).append("스트라이크");
        }
        return output.toString();
    }
}
