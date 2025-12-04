package com.xulioxesus;

public class Calculator {

    public double add(double a, double b) { return a + b; }

    public double sub(double a, double b) { return a - b; }

    public double mul(double a, double b) { return a * b; }

    public double div(double a, double b) {
        if (b == 0) throw new ArithmeticException("División entre cero");
        return a / b;
    }

    public double mod(double a, double b) {
        if (b == 0) throw new ArithmeticException("Módulo con cero");
        return a % b;
    }

    public double pow(double a, double b) { return Math.pow(a, b); }

}