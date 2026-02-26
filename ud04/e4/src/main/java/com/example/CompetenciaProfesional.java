package com.example;

public class CompetenciaProfesional {
    private String descripcion;
    private ModuloFormativo infModuFormat[];
    public CompetenciaProfesional(String descripcion, ModuloFormativo[] infModuFormat) {
        this.descripcion = descripcion;
        this.infModuFormat = infModuFormat;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public ModuloFormativo[] getInfModuFormat() {
        return infModuFormat;
    } 
}