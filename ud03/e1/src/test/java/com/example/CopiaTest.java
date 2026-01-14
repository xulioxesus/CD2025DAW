package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CopiaTest {

    @Test
    void prestar_establece_estado_prestado() {
        Libro libro = new Libro("O Señor dos Aneis", "Fantasía", "Minotauro", 1954);
        Copia copia = new Copia("C001", libro);

        copia.prestar();

        assertEquals("prestado", copia.estado);
    }

    @Test
    void devolver_establece_estado_disponible() {
        String identificador = "C001";
        Libro libro = new Libro("O Señor dos Aneis", "Fantasía", "Minotauro", 1954);
        Copia copia = new Copia(identificador, libro);
        copia.devolver();

        assertEquals("disponible", copia.estado);
    }

    @Test
    void prestar_y_devolver_cambia_el_estado_correctamente() {
        Libro libro = new Libro("O Señor dos Aneis", "Fantasía", "Minotauro", 1954);
        Copia copia = new Copia("C001", libro);

        copia.prestar();
        assertEquals("prestado", copia.estado);

        copia.devolver();
        assertEquals("disponible", copia.estado);
    }
}