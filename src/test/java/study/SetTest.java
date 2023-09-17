package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("요구사항1")
    void size() {
        int size = numbers.size();
        assertThat(size).isEqualTo(3);
    }

    @DisplayName("요구사항2")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void contains(int tt) {
        // constains를 활용한 테스트는 안되는걸까?
//        assertThat(numbers).contains(1, 2, 3);

        // parameterized test 실습
        assertThat(numbers.contains(tt)).isTrue();
    }

    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false"}, delimiter = ':')
    @DisplayName("입력 값에 따라 결과값이 다른 경우 확인")
    void containsValidate(int tt, boolean result) {
        boolean contains = numbers.contains(tt);
        assertThat(contains).isEqualTo(result);
    }
}
