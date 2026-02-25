package com.example;

public class Inscripcion {
    public Conferencia conferencia;
    public Participante participante;

    public Inscripcion(Conferencia conferencia, Participante participante) {
        this.conferencia = conferencia;
        this.participante = participante;
    }
}