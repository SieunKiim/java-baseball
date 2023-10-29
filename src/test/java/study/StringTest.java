package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("요구사항 1-1")
    void split1() {
        String given = "1,2";
        String[] split = given.split(",");
        assertThat(split).contains("1", "2");
    }

    @Test
    @DisplayName("요구사항 1-2")
    void split2() {
        String[] split = "1".split(",");
        assertThat(split).containsExactly("1");
    }

    @Test
    @DisplayName("요구사항2")
    void substring() {
        String given = "(1,2)";
        String substring = given.substring(1, given.length() - 1);
        assertThat(substring).isEqualTo("1,2");
    }

    @Test
    @DisplayName("범위 초과 시 Exception 발생")
    void charAtException(){
        String given = "abc";
        assertThatExceptionOfType(IndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    char c = given.charAt(3);
                }).withMessageMatching("String index out of range: \\d+");
    }
}
