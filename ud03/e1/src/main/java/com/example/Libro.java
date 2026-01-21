package com.example;

import java.util.ArrayList;

public class Libro {
    public String nome;
    public String tipo;
    public String editorial;
    public int ano;
    public ArrayList<Autor> autores;

    public Libro(String nome, String tipo, String editorial, int ano) {
        this.nome = nome;
        this.tipo = tipo;
        this.editorial = editorial;
        this.ano = ano;
        this.autores = new ArrayList<>();
    }
}
