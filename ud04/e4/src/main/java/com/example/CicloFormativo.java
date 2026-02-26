package com.example;

public class CicloFormativo {
    private String nombre;
    private String descripcion;
    private int horas;
    private CompetenciaProfesional infCompeProfesionales[];
    public CicloFormativo(String nombre, String descripcion, int horas, CompetenciaProfesional[] infCompeProfesionales) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.horas = horas;
        this.infCompeProfesionales = infCompeProfesionales;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public CompetenciaProfesional[] getInfCompeProfesionales() {
        return infCompeProfesionales;
    }
}