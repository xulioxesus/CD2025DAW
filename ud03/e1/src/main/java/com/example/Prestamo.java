package com.example;

import java.time.LocalDate;

public class Prestamo {

    public LocalDate fechaInicio;
    public LocalDate fechaFin;
    public Lector lector;
    public Copia copia;


    public Prestamo(LocalDate fechaInicio, Lector lector, Copia copia) {
        this.fechaInicio = fechaInicio;
        this.lector = lector;
        this.copia = copia;
        this.fechaFin = calcularFechaFin();
    }

    public LocalDate calcularFechaFin() {
        return fechaInicio.plusDays(15);
    }

    public boolean generarMulta() {
        return LocalDate.now().isAfter(fechaFin);
    }
}
