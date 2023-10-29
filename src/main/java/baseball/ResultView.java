package baseball;

public class ResultView {

    public void inputMessage() {
        System.out.print("숫자를 입력해 주세요 : ");
    }

    public void endMessage(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }


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
