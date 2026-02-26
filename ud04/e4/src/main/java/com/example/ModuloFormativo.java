package com.example;

public class ModuloFormativo {
    private String nombre;
    private int duración;
    private String contenido;
    private Alumno infAlumMatriculados[];
    private Profesor profesorImparte;
    private Examen examen;
    private Tarea tarea;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDuración() {
        return duración;
    }
    public void setDuración(int duración) {
        this.duración = duración;
    }
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public Alumno[] getInfAlumMatriculados() {
        return infAlumMatriculados;
    }
    public Profesor getProfesorImparte() {
        return profesorImparte;
    }
    public void setProfesorImparte(Profesor profesorImparte) {
        this.profesorImparte = profesorImparte;
    }
    public Examen getExamen() {
        return examen;
    }
    public void setExamen(Examen examen) {
        this.examen = examen;
    }
    public Tarea getTarea() {
        return tarea;
    }
    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }
}