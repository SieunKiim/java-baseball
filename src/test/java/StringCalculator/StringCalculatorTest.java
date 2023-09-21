package StringCalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {

    private StringCalculator calculator;

    @BeforeEach
    void setUp() {
        InputStream in = new ByteArrayInputStream("2 + 3 * 4 / 2".getBytes());
        System.setIn(in);
        calculator = new StringCalculator();
    }

    @Test
    @DisplayName("계산기 생성")
    void initCalculator() {
        assertThat(calculator.getRaw().length).isNotEqualTo(0);
    }

    @Test
    @DisplayName("계산기 동작")
    void calculate(){
        int calculate = calculator.calculate();
        assertThat(calculate).isEqualTo(10);
    }
}
