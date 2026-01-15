package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AutorTest {

    @Test
    void constructorInicializaCorrectamente() {
        Autor autor = new Autor("Miguel de Cervantes", "Española", "1547-09-29");

        assertEquals("Miguel de Cervantes", autor.nombre);
        assertEquals("Española", autor.nacionalidad);
        assertEquals("1547-09-29", autor.fechaNacimiento);
        assertNotNull(autor.libros);
        assertTrue(autor.libros.isEmpty());
    }
}
