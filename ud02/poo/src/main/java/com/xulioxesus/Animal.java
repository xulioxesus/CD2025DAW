package com.xulioxesus;

public class Animal {

    int peso = 0;

    void comer(){
        System.out.println("Estou comendo");
    }

    void incrementarPeso(int p, float a){
        peso = peso + p;
    }

    void incrementarPeso(float a, int p){
        peso = (int)(peso + p);
    }

    void incrementarPeso(int p){
        peso = peso + p*2;
    }

    void incrementarPeso(float p){
        peso = (int) (peso + p);
    }
}
