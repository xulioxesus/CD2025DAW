package com.example;

import java.time.LocalDate;

public class Multa {

    public LocalDate fechaInicio;
    public LocalDate fechaFin;
    public Prestamo prestamo;

    public Multa(LocalDate fechaInicio, Prestamo prestamo) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = calcularFecha();
        this.prestamo = prestamo;
    }

    public LocalDate calcularFecha() {
        return fechaInicio.plusDays(30);
    }
}