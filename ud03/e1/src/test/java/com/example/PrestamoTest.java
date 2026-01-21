package com.example;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class PrestamoTest {

    @Test
    void constructorInicializaCorrectamente() {
        Lector lector = new Lector(1, "Ana", "Pérez", "Rúa A");
        Autor autor = new Autor("Miguel de Cervantes", "Española", "1547-09-29");
        Libro libro = new Libro("El Quijote", "Novela", "1234567890", 1605);
        Copia copia = new Copia("1", libro);
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
        Autor autor = new Autor("Gabriel García Márquez", "Colombiana", "1927-03-06");
        Libro libro = new Libro("Cien Años de Soledad", "Novela", "0987654321", 1967);
        libro.autores.add(autor);
        Prestamo prestamo = new Prestamo(
                fechaInicio,
                new Lector(2, "Brais", "García", "Rúa B"),
                new Copia("1", libro)
        );

        assertEquals(LocalDate.of(2025, 3, 25), prestamo.calcularFechaFin());
    }

    @Test
    void generarMultaDevuelveFalseSiNoEstaFueraDePlazo() {
        LocalDate fechaInicio = LocalDate.now().minusDays(5);
        Libro libro = new Libro("1984", "Distopía", "Secker & Warburg", 1949);
        Prestamo prestamo = new Prestamo(
                fechaInicio,
                new Lector(2, "Brais", "García", "Rúa B"),
                new Copia("1", libro)
        );

        assertFalse(prestamo.generarMulta());
    }

    @Test
    void generarMultaDevuelveTrueSiEstaFueraDePlazo() {
        LocalDate fechaInicio = LocalDate.now().minusDays(30);
        Libro libro = new Libro("1984", "Distopía", "Secker & Warburg", 1949);
        Prestamo prestamo = new Prestamo(
                fechaInicio,
                new Lector(2, "Brais", "García", "Rúa B"),
                new Copia("1", libro)
        );

        assertTrue(prestamo.generarMulta());
    }
}