package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AnswerNumTest {

    private AnswerNum answerNum;

    @BeforeEach
    void initTest() {
        answerNum = new AnswerNum(345);
    }

    @Test
    @DisplayName("정답 클래스 생성")
    void init() {
        assertThat(answerNum.getAnswer().size()).isEqualTo(3);
    }

    @Test
    @DisplayName("AnswerNum 과 숫자 비교 (정답 경우)")
    void compareCorrect() {
        HashMap<String, Integer> compare = answerNum.compare(345);
        assertThat(compare.get("s")).isEqualTo(3);
        assertThat(compare.get("b")).isEqualTo(0);

    }

    @Test
    @DisplayName("AnswerNum 과 숫자 비교 (1S 2B 경우)")
    void compare1S2B() {
        HashMap<String, Integer> compare = answerNum.compare(354);
        assertThat(compare.get("s")).isEqualTo(1);
        assertThat(compare.get("b")).isEqualTo(2);
    }

    @Test
    @DisplayName("AnswerNum 과 숫자 비교 (2S 경우)")
    void compare2S(){
        HashMap<String, Integer> compare = answerNum.compare(347);
        assertThat(compare.get("s")).isEqualTo(2);
        assertThat(compare.get("b")).isEqualTo(0);

    }

    @Test
    @DisplayName("AnswerNum 과 숫자 비교 (nothing 경우)")
    void compareNothing(){
        HashMap<String, Integer> compare = answerNum.compare(198);
        assertThat(compare.get("s")).isEqualTo(0);
        assertThat(compare.get("b")).isEqualTo(0);
    }
}
