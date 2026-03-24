package com.example;

import org.junit.jupiter.api.Test;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void factorialDeCero() throws Exception {
        Factorial f = new Factorial();
        assertEquals(BigInteger.ONE, f.factorial(0));
    }

    @Test
    void factorialDeUno() throws Exception {
        Factorial f = new Factorial();
        assertEquals(BigInteger.ONE, f.factorial(1));
    }

    @Test
    void factorialDeCinco() throws Exception {
        Factorial f = new Factorial();
        assertEquals(BigInteger.valueOf(120), f.factorial(5));
    }

    @Test
    void factorialDeDiez() throws Exception {
        Factorial f = new Factorial();
        assertEquals(BigInteger.valueOf(3628800), f.factorial(10));
    }

    @Test
    void factorialDeNumeroNegativo() {
        Factorial f = new Factorial();

        Exception exception = assertThrows(Exception.class, () -> {
            f.factorial(-1);
        });

        assertEquals("Error. El número tiene que ser >=0", exception.getMessage());
    }

    @Test
    void factorialGrande() throws Exception {
        Factorial f = new Factorial();

        assertEquals(
            new BigInteger("2432902008176640000"), // 20!
            f.factorial(20)
        );
    }
}