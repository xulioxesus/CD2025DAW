package com.example;

public class Pregunta {
    private String enunciado;
    private String respuestas[];
    private int respuestaValida;
    private Examen examenesDondeSeUsa[];
    public Pregunta(String enunciado, String[] respuestas, int respuestaValida, Examen[] examenesDondeSeUsa) {
        this.enunciado = enunciado;
        this.respuestas = respuestas;
        this.respuestaValida = respuestaValida;
        this.examenesDondeSeUsa = examenesDondeSeUsa;
    }
    public String getEnunciado() {
        return enunciado;
    }
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
    public String[] getRespuestas() {
        return respuestas;
    }
    public int getRespuestaValida() {
        return respuestaValida;
    }
    public void setRespuestaValida(int respuestaValida) {
        this.respuestaValida = respuestaValida;
    }
    public Examen[] getExamenesDondeSeUsa() {
        return examenesDondeSeUsa;
    }
}