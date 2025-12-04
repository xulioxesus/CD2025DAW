package com.xulioxesus;

public class ProbarCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        double a = 10;
        double b = 5;

        System.out.println("Suma: " + calc.add(a, b));
        System.out.println("Resta: " + calc.sub(a, b));
        System.out.println("Multiplicación: " + calc.mul(a, b));
        System.out.println("División: " + calc.div(a, b));
        System.out.println("Módulo: " + calc.mod(a, b));
        System.out.println("Potencia: " + calc.pow(a, b));
    }
}
