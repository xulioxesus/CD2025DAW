package com.example;

public class Lector {

    public int numSocio;
    public String nombre;
    public String apellidos;
    public String direccion;

    public Lector(int numSocio, String nombre, String apellidos, String direccion) {
        this.numSocio = numSocio;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }

    public boolean comprobarMultasPendientes() {
        return false;
    }
}