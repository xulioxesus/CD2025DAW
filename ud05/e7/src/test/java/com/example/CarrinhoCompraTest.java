package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CarrinhoCompraTest {

    @Test
    void testEngadirProduto() {
        CarrinhoCompra c = new CarrinhoCompra();
        Produto p = new Produto("Teclado", 50.0);

        c.engadirProduto(p);

        assertEquals(1, c.getNumeroProdutos());
    }

    @Test
    void testCalcularTotal() {
        CarrinhoCompra c = new CarrinhoCompra();
        c.engadirProduto(new Produto("Rato", 20.0));
        c.engadirProduto(new Produto("Teclado", 50.0));

        assertEquals(70.0, c.calcularTotal());
    }

    @Test
    void testCarrinhoBaleiro() {
        CarrinhoCompra c = new CarrinhoCompra();

        assertEquals(0.0, c.calcularTotal());
    }

    @Test
    void testEliminarProduto() {
        CarrinhoCompra c = new CarrinhoCompra();
        Produto p = new Produto("Monitor", 150.0);

        c.engadirProduto(p);
        c.eliminarProduto(p);

        assertEquals(0, c.getNumeroProdutos());
    }

    @Test
    void testProdutoConPrezoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Produto("Erro", -10.0);
        });
    }
}