package com.xulioxesus;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calc;
    private static final double EPS = 1e-9;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    // --- add ---
    @ParameterizedTest(name = "add({0}, {1}) = {2}")
    @CsvSource({
            "0, 0, 0",
            "1, 2, 3",
            "-1, 2, 1",
            "1.5, 2.3, 3.8"
    })
    void testAdd(double a, double b, double expected) {
        assertEquals(expected, calc.add(a, b), EPS);
    }

    // --- sub ---
    @ParameterizedTest(name = "sub({0}, {1}) = {2}")
    @CsvSource({
            "0, 0, 0",
            "5, 2, 3",
            "2, 5, -3",
            "1.5, 0.2, 1.3"
    })
    void testSub(double a, double b, double expected) {
        assertEquals(expected, calc.sub(a, b), EPS);
    }

    // --- mul ---
    @ParameterizedTest(name = "mul({0}, {1}) = {2}")
    @CsvSource({
            "0, 0, 0",
            "0, 7, 0",
            "3, 4, 12",
            "-2, 4, -8",
            "1.5, 2, 3"
    })
    void testMul(double a, double b, double expected) {
        assertEquals(expected, calc.mul(a, b), EPS);
    }

    // --- div ---
    @ParameterizedTest(name = "div({0}, {1}) = {2}")
    @CsvSource({
            "6, 3, 2",
            "-6, 3, -2",
            "7.5, 2.5, 3",
            "1, -4, -0.25"
    })
    void testDiv(double a, double b, double expected) {
        assertEquals(expected, calc.div(a, b), EPS);
    }

    @Test
    void testDivByZeroThrows() {
        ArithmeticException ex = assertThrows(ArithmeticException.class, () -> calc.div(1, 0));
        assertEquals("División entre cero", ex.getMessage());
    }

    // --- mod ---
    @ParameterizedTest(name = "mod({0}, {1}) = {2}")
    @CsvSource({
            "7, 3, 1",
            "-7, 3, -1",
            "7, -3, 1",
            "7.5, 2, 1.5"
    })
    void testMod(double a, double b, double expected) {
        assertEquals(expected, calc.mod(a, b), EPS);
    }

    @Test
    void testModByZeroThrows() {
        ArithmeticException ex = assertThrows(ArithmeticException.class, () -> calc.mod(1, 0));
        assertEquals("Módulo con cero", ex.getMessage());
    }

    // --- pow ---
    @ParameterizedTest(name = "pow({0}, {1}) = {2}")
    @CsvSource({
            "2, 3, 8",
            "5, 0, 1",
            "2, -2, 0.25",
            "9, 0.5, 3",
            "-2, 3, -8"
    })
    void testPow(double a, double b, double expected) {
        assertEquals(expected, calc.pow(a, b), EPS);
    }
}