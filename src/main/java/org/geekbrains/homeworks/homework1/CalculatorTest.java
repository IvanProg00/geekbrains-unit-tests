package org.geekbrains.homeworks.homework1;

import static org.assertj.core.api.Assertions.*;

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

        // Test method `calculatingDiscount`
        assertThat(Calculator.calculatingDiscount(70, 100))
                .isEqualTo(0);
        assertThat(Calculator.calculatingDiscount(36, 0))
                .isEqualTo(36);
        assertThat(Calculator.calculatingDiscount(150, 50))
                .isEqualTo(75);
        assertThat(Calculator.calculatingDiscount(200, 25))
                .isEqualTo(150);
        assertThat(Calculator.calculatingDiscount(180, 75))
                .isEqualTo(45);

        assertThatThrownBy(() -> Calculator.calculatingDiscount(50.2, 101))
                .isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() -> Calculator.calculatingDiscount(32.7, -1))
                .isInstanceOf(ArithmeticException.class);
    }
}