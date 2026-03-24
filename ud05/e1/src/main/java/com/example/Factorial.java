package com.example;

import java.math.BigInteger;

public class Factorial {

    public BigInteger factorial(int n) throws Exception {
        if (n < 0) {
            throw new Exception("Error. El número tiene que ser >=0");
        }

        BigInteger resultado = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            resultado = resultado.multiply(BigInteger.valueOf(i));
        }

        return resultado;
    }
}