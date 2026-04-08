package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

/**
 * Unit test for Fibonacci class.
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...
 */
public class FibonacciTest {

    @Test
    void fibonacciCero() throws Exception{
        Fibonacci fib = new Fibonacci();
        assertEquals(BigInteger.ZERO, fib.fibonacci(0));
    }

}
