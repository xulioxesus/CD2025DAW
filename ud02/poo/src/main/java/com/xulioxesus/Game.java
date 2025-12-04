package com.xulioxesus;

public class Game {
    //========================================
    //Atributos de clase
    //========================================
    static int numXogosComprados = 0;

    //========================================
    //Atributos de instancia
    //========================================
    String name;
    Float prize;

    //========================================
    // Constructores
    //========================================


    Game(String n, Float p) {
        name = n;
        prize = p;
    }

    public Game() {
        this("kk",3.4f);
        name = "";
        prize = 0.0f;
    }
}
