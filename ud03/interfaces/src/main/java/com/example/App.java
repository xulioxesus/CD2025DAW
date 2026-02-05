package com.example;

public class App {

    public static void test(Reproductor reproductor) {
        reproductor.reproducir();
        reproductor.pausar();
        reproductor.detener();
    }

    public static void test2(ImprimibleEnPdf imprimible) {
        imprimible.gardar();
        imprimible.exportarAPdf();
    }

    public static void main(String[] args) {
        ReproductorAudio audio = new ReproductorAudio("Mi Canción", "http://example.com/audio.mp3", "mp3");
        ReproductorVideo video = new ReproductorVideo("Mi Video", "http://example.com/video.mp4")

        ReproductorAudio rep = new ReproductorAudio(null, null, null);
        rep.reproducir();
        rep.exportarAPdf();

        Reproductor ra = rep;
        ra.reproducir();
        ra.exportarAPdf();

        ImprimibleEnPdf imp = rep;
        imp.reproducir();
        imp.exportarAPdf();


        test(video);
        test(audio);

        test2(audio);
        test2(video);
     
    }
}
