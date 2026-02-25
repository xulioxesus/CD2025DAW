package com.example;

import java.util.List;

public class Participante {
    public String nombre;
    public String email;

    public List<Conferencia> conferencias;

    public Participante(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.conferencias = List.of();
    }

    public void inscribirEnConferencia(Conferencia conferencia) {
        this.conferencias.add(conferencia);
    }

    public void cancelarInscripcion(Conferencia conferencia) {
        this.conferencias.remove(conferencia);
    }
}
