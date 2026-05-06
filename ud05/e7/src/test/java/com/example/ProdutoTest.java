package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProdutoTest {

    @Test
    void testCrearProdutoCorrecto() {
        Produto p = new Produto("Teclado", 50.0);

        assertEquals("Teclado", p.getNome());
        assertEquals(50.0, p.getPrezo());
    }

    @Test
    void testNomeNonNulo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Produto(null, 10.0);
        });
    }

    @Test
    void testNomeNonBaleiro() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Produto("", 10.0);
        });
    }

    @Test
    void testPrezoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Produto("Rato", -5.0);
        });
    }

    @Test
    void testModificarPrezo() {
        Produto p = new Produto("Monitor", 100.0);

        p.setPrezo(120.0);

        assertEquals(120.0, p.getPrezo());
    }

    @Test
    void testModificarPrezoNegativo() {
        Produto p = new Produto("Monitor", 100.0);

        assertThrows(IllegalArgumentException.class, () -> {
            p.setPrezo(-20.0);
        });
    }

    @Test
    void testModificarNome() {
        Produto p = new Produto("Antigo", 10.0);

        p.setNome("Novo");

        assertEquals("Novo", p.getNome());
    }

    @Test
    void testModificarNomeInvalido() {
        Produto p = new Produto("Correcto", 10.0);

        assertThrows(IllegalArgumentException.class, () -> {
            p.setNome("");
        });
    }
}