package com.example;

import java.util.List;

public class Conferencia {
    public String nome;
    public String lugar;
    public LocalDate dataInicio;
    public LocalDate dataFin;

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
