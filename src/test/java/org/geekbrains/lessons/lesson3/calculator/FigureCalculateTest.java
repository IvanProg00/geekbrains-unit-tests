package org.geekbrains.lessons.lesson3.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FigureCalculateTest {
    @Test
    void computeLengthCircle() {
        FigureCalculate figureCalculate = new FigureCalculate();
        double result = figureCalculate.calculate(20);
        assertEquals(62.83185307179586, result);
    }
}