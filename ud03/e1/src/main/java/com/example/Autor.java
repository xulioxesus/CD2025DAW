package com.example;

import java.util.ArrayList;

public class Autor {

    public String nombre;
    public String nacionalidad;
    public String fechaNacimiento;
    public ArrayList<Libro> libros;

    public Autor(String nombre, String nacionalidad, String fechaNacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        this.libros = new ArrayList<>();
    }
}
