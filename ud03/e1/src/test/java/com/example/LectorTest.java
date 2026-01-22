package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LectorTest {

    @Test
    void constructorInicializaCorrectamente() {
        Lector lector = new Lector(101, "Ana", "Pérez López", "Rúa Real 12");

        assertEquals(101, lector.numSocio);
        assertEquals("Ana", lector.nombre);
        assertEquals("Pérez López", lector.apellidos);
        assertEquals("Rúa Real 12", lector.direccion);
    }

    @Test
    void comprobarMultasPendientesPorDefectoFalse() {
        Lector lector = new Lector(101, "Ana", "Pérez López", "Rúa Real 12");

        assertFalse(lector.comprobarMultasPendientes());
    }

    @Test
    void pódenseModificarCamposPublicos() {
        Lector lector = new Lector(101, "Ana", "Pérez López", "Rúa Real 12");

        lector.numSocio = 202;
        lector.nombre = "Brais";
        lector.apellidos = "García";
        lector.direccion = "Av. de Galicia 5";

        assertEquals(202, lector.numSocio);
        assertEquals("Brais", lector.nombre);
        assertEquals("García", lector.apellidos);
        assertEquals("Av. de Galicia 5", lector.direccion);
    }
}