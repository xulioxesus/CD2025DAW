package com.example;

public class Copia {
    public String identificador;
    public String estado;
    public Libro original;

    public Copia(String identificador, Libro original) {
        this.identificador = identificador;
        this.original = original;
        this.estado = "disponible";
    }

    public void prestar() {
        this.estado = "prestado";
    }

    public void devolver() {
        this.estado = "disponible";
    }
}
