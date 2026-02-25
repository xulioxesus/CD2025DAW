package com.example;

import java.util.List;

public class Conferencia {
    public String titulo;
    public String fecha;
    public String lugar;

    public List<Participante> participantes;

    public Conferencia(String titulo, String fecha, String lugar) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.lugar = lugar;
        this.participantes = List.of();
    }

    public void agregarParticipante(Participante participante) {
        this.participantes.add(participante);
    }

    public void eliminarParticipante(Participante participante) {
        this.participantes.remove(participante);
    }
}
