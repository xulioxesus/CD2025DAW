package com.example;

public class App {
    public static void main(String[] args) {
        Conferencia conferencia = new Conferencia("Conferencia de Java", "2024-10-01", "Madrid");
        Participante participante = new Participante("Juan Pérez", "juan.perez@example.com");
        Inscripcion inscripcion = new Inscripcion(conferencia, participante);
        System.out.println("Inscripción realizada con éxito.");
    }
}
