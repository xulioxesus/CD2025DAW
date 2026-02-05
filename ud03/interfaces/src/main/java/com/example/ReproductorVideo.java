package com.example;

public class ReproductorVideo implements Reproductor {

    String nome;
    String url;

    public ReproductorVideo(String nome, String url) {
        this.nome = nome;
        this.url = url;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo video: " + nome + " desde URL: " + url);
    }

    @Override
    public void pausar() {
        System.out.println("Video pausado: " + nome);
    }

    @Override
    public void detener() {
        System.out.println("Video detenido: " + nome);
    }
}