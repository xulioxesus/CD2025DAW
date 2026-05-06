package com.example

import kotlin.test.Test
import kotlin.test.assertEquals

class AlumnoTest {

    @Test
    fun `constructor baleiro crea alumno por defecto`() {
        val alumno = Alumno()

        assertEquals("", alumno.nombre)
        assertEquals(0, alumno.edad)
        assertEquals(0.0, alumno.notaMedia)
    }

    @Test
    fun `constructor con parametros asigna valores`() {
        val alumno = Alumno("Ana", 20, 8.5)

        assertEquals("Ana", alumno.nombre)
        assertEquals(20, alumno.edad)
        assertEquals(8.5, alumno.notaMedia)
    }

    @Test
    fun `setter e getter de nome funcionan`() {
        val alumno = Alumno()

        alumno.nombre = "Luis"

        assertEquals("Luis", alumno.nombre)
    }

    @Test
    fun `setter e getter de idade funcionan`() {
        val alumno = Alumno()

        alumno.edad = 18

        assertEquals(18, alumno.edad)
    }

    @Test
    fun `setter e getter de nota media funcionan`() {
        val alumno = Alumno()

        alumno.notaMedia = 7.25

        assertEquals(7.25, alumno.notaMedia)
    }

    @Test
    fun `modificar todos os atributos`() {
        val alumno = Alumno()

        alumno.nombre = "Marta"
        alumno.edad = 19
        alumno.notaMedia = 9.2

        assertEquals("Marta", alumno.nombre)
        assertEquals(19, alumno.edad)
        assertEquals(9.2, alumno.notaMedia)
    }

    @Test
    fun `constructor admite suspenso`() {
        val alumno = Alumno("Pedro", 17, 4.3)

        assertEquals(4.3, alumno.notaMedia)
    }

    @Test
    fun `constructor admite sobresaliente`() {
        val alumno = Alumno("Noa", 21, 10.0)

        assertEquals(10.0, alumno.notaMedia)
    }
}