package com.example;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class PrestamoTest {

    @Test
    void constructorInicializaCorrectamente() {
        Lector lector = new Lector(1, "Ana", "Pérez", "Rúa A");
        Autor autor = new Autor("Miguel de Cervantes");
        Libro libro = new Libro("El Quijote", autor);
        Copia copia = new Copia(1001);
        LocalDate fechaInicio = LocalDate.of(2025, 1, 1);

        Prestamo prestamo = new Prestamo(fechaInicio, lector, copia);

        assertEquals(fechaInicio, prestamo.fechaInicio);
        assertEquals(lector, prestamo.lector);
        assertEquals(copia, prestamo.copia);
        assertEquals(fechaInicio.plusDays(15), prestamo.fechaFin);
    }

    @Test
    void calcularFechaFinEngade15Dias() {
        LocalDate fechaInicio = LocalDate.of(2025, 3, 10);
        Prestamo prestamo = new Prestamo(
                fechaInicio,
                new Lector(2, "Brais", "García", "Rúa B"),
                new Copia(2002)
        );

        assertEquals(LocalDate.of(2025, 3, 25), prestamo.calcularFechaFin());
    }

    @Test
    void generarMultaDevuelveFalseSiNoEstaFueraDePlazo() {
        LocalDate fechaInicio = LocalDate.now().minusDays(5);
        Prestamo prestamo = new Prestamo(
                fechaInicio,
                new Lector(3, "Uxía", "López", "Rúa C"),
                new Copia(3003)
        );

        assertFalse(prestamo.generarMulta());
    }

    @Test
    void generarMultaDevuelveTrueSiEstaFueraDePlazo() {
        LocalDate fechaInicio = LocalDate.now().minusDays(30);
        Prestamo prestamo = new Prestamo(
                fechaInicio,
                new Lector(4, "Xoán", "Fernández", "Rúa D"),
                new Copia(4004)
        );

        assertTrue(prestamo.generarMulta());
    }
}