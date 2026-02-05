package com.example;

public class ReproductorAudio implements Reproductor, ImprimibleEnPdf {

    String nome;
    String url;
    String formato;

    public ReproductorAudio(String nome, String url, String formato) {
        this.nome = nome;
        this.url = url;
        this.formato = formato;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo audio: " + nome + " desde URL: " + url + " con formato: " + formato);
    }

    @Override
    public void pausar() {
        System.out.println("Audio pausado: " + nome);
    }

    @Override
    public void detener() {
        System.out.println("Audio detenido: " + nome);
    }

    @Override
    public void gardar() {
        System.out.println("Guardando audio: " + nome);
    }

    @Override
    public void exportarAPdf() {
        System.out.println("Exportando audio: " + nome + " a PDF");
    }
}