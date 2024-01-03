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

    @ParameterizedTest
    @ValueSource(ints = {26, 99, 27, 33, 45, 55, 66})
    void numberInIntervalReturnsTrue(int n) {
        assertTrue(mainHW.numberInInterval(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {25, 100, -25, -26, -33, -99, -100, 109, 24, 124})
    void numberNotInIntervalReturnsFalse(int n) {
        assertFalse(mainHW.numberInInterval(n));
    }
}