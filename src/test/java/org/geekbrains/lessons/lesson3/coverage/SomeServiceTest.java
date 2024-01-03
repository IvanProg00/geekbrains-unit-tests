package org.geekbrains.lessons.lesson3.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SomeServiceTest {
    SomeService someService;

    @BeforeEach
    void setup() {
        someService = new SomeService();
    }

    // 3.1.
    @ParameterizedTest
    @ValueSource(ints = {3, 6, 21, 99, 159, 162, 171, 198})
    void fizzTest(int n) {
        String result = someService.fizzBuzz(n);
        assertThat(result).isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 40, 55, 125})
    void buzzTest(int n) {
        String result = someService.fizzBuzz(n);
        assertThat(result).isEqualTo("Buzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 60, 75, 90, 105, 120})
    void fizzBuzzTest(int n) {
        String result = someService.fizzBuzz(n);
        assertThat(result).isEqualTo("FizzBuzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 7, 11, 17, 19, 22, 23, 44, 47})
    void notFizzBuzzTest(int n) {
        String result = someService.fizzBuzz(n);
        assertThat(result).isNull();
    }

    @Test
    void startsFrom6ReturnsTrue() {
        boolean result = someService.firstLast6(new int[]{6, 5, 2, 8});
        assertTrue(result);
    }

    @Test
    void endsFrom6ReturnsTrue() {
        boolean result = someService.firstLast6(new int[]{9, 5, 2, 8, 6});
        assertTrue(result);
    }

    @Test
    void no6ReturnsFalse() {
        boolean result = someService.firstLast6(new int[]{8, 1, 4});
        assertFalse(result);
    }

    @Test
    void emptyReturnsFalse() {
        boolean result = someService.firstLast6(new int[]{});
        assertFalse(result);
    }

    @Test
    void noFirstAndLast6ReturnsFalse() {
        boolean result = someService.firstLast6(new int[]{4, 6, 6, 1, 6, 2});
        assertFalse(result);
    }

    @Test
    void nullRaisesFirstLast6() {
        assertThatThrownBy(() -> someService.firstLast6(null))
                .isInstanceOf(NullPointerException.class);
    }
}