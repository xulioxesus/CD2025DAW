package com.xulioxesus;

public class Funcion{

    static double calcularAreaRectangulo(double b, double a){
        double resultado = a*b;
        System.out.println("Área do rectángulo: " + resultado);
        return resultado;
    }

    public static void main(String[] args) {
        double base = 10;
        double altura = 5;

        double areaRectangulo = calcularAreaRectangulo(base, altura);

        base = 3;
        altura = 7;
        areaRectangulo = calcularAreaRectangulo(base, altura);

        base = 5;
        altura = 9;
        areaRectangulo = calcularAreaRectangulo(base, altura);

        base = 6;
        altura = 17;
        areaRectangulo = calcularAreaRectangulo(base, altura);
    }
}
