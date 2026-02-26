package com.example;

public class Profesor extends Persona {
    private int NPR;
    public Profesor(int NPR, String nombre, String direccion, String telefono, String alias, String correoElectronico) {
        super(nombre, direccion, telefono, alias, correoElectronico);
        this.NPR = NPR;
    }
}