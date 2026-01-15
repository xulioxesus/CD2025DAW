package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibroTest {

    @Test
    void constructorDebeInicializarCorrectamenteLosAtributos() {
        // Arrange
        String nome = "O Señor dos Aneis";
        String tipo = "Fantasía";
        String editorial = "Minotauro";
        int ano = 1954;

        // Act
        Libro libro = new Libro(nome, tipo, editorial, ano);

        // Assert
        assertEquals(nome, libro.nome);
        assertEquals(tipo, libro.tipo);
        assertEquals(editorial, libro.editorial);
        assertEquals(ano, libro.ano);
        assertNotNull(libro.escrito);
        assertTrue(libro.escrito.isEmpty());
    }
}
