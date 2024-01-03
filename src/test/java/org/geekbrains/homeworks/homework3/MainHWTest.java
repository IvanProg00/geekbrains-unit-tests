package org.geekbrains.homeworks.homework3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainHWTest {
    MainHW mainHW;

    @BeforeEach
    void setup() {
        mainHW = new MainHW();
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 2, 4, 10, 20, 1026, -4, -6, -372})
    void evenNumbersReturnsTrue(int n) {
        assertTrue(mainHW.evenOddNumber(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 11, 21, 1057, -3, -7, -421})
    void oddNumbersReturnsFalse(int n) {
        assertFalse(mainHW.evenOddNumber(n));
    }
}