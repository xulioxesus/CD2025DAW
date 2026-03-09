package com.example;

import java.util.List;

public class Artigo {
    public String titulo;
    public String tema;

    private List<Autores> autores = new ArrayList<>();

    public Artigo(String titulo, String tema) {
        this.titulo = titulo;
        this.tema = tema;
    }

    public void agregarAutor(Autores autor) {
        this.autores.add(autor);
    }

    public void eliminarAutor(Autores autor) {
        this.autores.remove(autor);
    }
}
