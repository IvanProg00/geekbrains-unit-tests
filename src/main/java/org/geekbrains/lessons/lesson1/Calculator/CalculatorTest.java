package org.geekbrains.lessons.lesson1.Calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {
    public static void main(String[] args) {
        assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);
        assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
        assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
        assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(2);

        assertThatThrownBy(() ->
                Calculator.calculation(8, 4, '_')
        ).isInstanceOf(IllegalStateException.class);

        assertThatThrownBy(() ->
                Calculator.calculation(5, 0, '/')
        ).isInstanceOf(ArithmeticException.class);
    }
}