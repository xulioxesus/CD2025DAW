package com.example;

import java.math.BigInteger;

public class Fibonacci {

    public BigInteger fibonacci(int n) throws Exception {
        if (n < 0) {
            throw new Exception("Error. El número tiene que ser >=0");
        }

        if (n == 0) {
            return BigInteger.ZERO;
        }

        if (n == 1) {
            return BigInteger.ONE;
        }

        BigInteger anterior = BigInteger.ZERO;
        BigInteger actual = BigInteger.ONE;
        BigInteger resultado = BigInteger.ZERO;

        for (int i = 2; i <= n; i++) {
            resultado = anterior.add(actual);
            anterior = actual;
            actual = resultado;
        }

        return actual;
    }
}