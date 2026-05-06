package com.example

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class AlumnoManagerTest {

    @Test
    fun `agregar alumno engade un alumno valido`() {
        val manager = AlumnoManager()
        val alumno = Alumno("Ana", 20, 8.5)

        manager.agregarAlumno(alumno)

        assertEquals(1, manager.getAlumnos().size)
        assertEquals("Ana", manager.getAlumnos()[0].nombre)
    }

    @Test
    fun `agregar alumno nulo non engade nada`() {
        val manager = AlumnoManager()

        manager.agregarAlumno(null)

        assertEquals(0, manager.getAlumnos().size)
    }

    @Test
    fun `buscar alumno por nome devolve o alumno correcto`() {
        val manager = AlumnoManager()
        val alumno = Alumno("Luis", 17, 6.5)

        manager.agregarAlumno(Alumno("Ana", 20, 8.5))
        manager.agregarAlumno(alumno)

        val resultado = manager.buscarAlumnoPorNombre("Luis")

        assertEquals(alumno, resultado)
    }

    @Test
    fun `buscar alumno inexistente devolve null`() {
        val manager = AlumnoManager()

        manager.agregarAlumno(Alumno("Ana", 20, 8.5))

        val resultado = manager.buscarAlumnoPorNombre("Pedro")

        assertNull(resultado)
    }

    @Test
    fun `calcular media sen alumnos devolve cero`() {
        val manager = AlumnoManager()

        val resultado = manager.calcularMedia()

        assertEquals(0.0, resultado)
    }

    @Test
    fun `calcular media con varios alumnos`() {
        val manager = AlumnoManager()

        manager.agregarAlumno(Alumno("Ana", 20, 8.0))
        manager.agregarAlumno(Alumno("Luis", 17, 6.0))
        manager.agregarAlumno(Alumno("Marta", 19, 10.0))

        val resultado = manager.calcularMedia()

        assertEquals(8.0, resultado)
    }

    @Test
    fun `clasificar alumno nulo`() {
        val manager = AlumnoManager()

        val resultado = manager.clasificarAlumno(null)

        assertEquals("Alumno nulo", resultado)
    }

    @Test
    fun `clasificar sobresaliente adulto`() {
        val manager = AlumnoManager()
        val alumno = Alumno("Ana", 18, 9.0)

        val resultado = manager.clasificarAlumno(alumno)

        assertEquals("Sobresaliente adulto", resultado)
    }

    @Test
    fun `clasificar sobresaliente menor`() {
        val manager = AlumnoManager()
        val alumno = Alumno("Luis", 17, 9.0)

        val resultado = manager.clasificarAlumno(alumno)

        assertEquals("Sobresaliente menor", resultado)
    }

    @Test
    fun `clasificar notable adulto`() {
        val manager = AlumnoManager()
        val alumno = Alumno("Marta", 18, 7.0)

        val resultado = manager.clasificarAlumno(alumno)

        assertEquals("Notable adulto", resultado)
    }

    @Test
    fun `clasificar notable menor`() {
        val manager = AlumnoManager()
        val alumno = Alumno("Pedro", 16, 7.0)

        val resultado = manager.clasificarAlumno(alumno)

        assertEquals("Notable menor", resultado)
    }

    @Test
    fun `clasificar aprobado adulto`() {
        val manager = AlumnoManager()
        val alumno = Alumno("Sara", 18, 5.0)

        val resultado = manager.clasificarAlumno(alumno)

        assertEquals("Aprobado adulto", resultado)
    }

    @Test
    fun `clasificar aprobado menor`() {
        val manager = AlumnoManager()
        val alumno = Alumno("Iria", 15, 5.0)

        val resultado = manager.clasificarAlumno(alumno)

        assertEquals("Aprobado menor", resultado)
    }

    @Test
    fun `clasificar suspenso adulto`() {
        val manager = AlumnoManager()
        val alumno = Alumno("Xoel", 18, 4.9)

        val resultado = manager.clasificarAlumno(alumno)

        assertEquals("Suspenso adulto", resultado)
    }

    @Test
    fun `clasificar suspenso menor`() {
        val manager = AlumnoManager()
        val alumno = Alumno("Noa", 16, 4.9)

        val resultado = manager.clasificarAlumno(alumno)

        assertEquals("Suspenso menor", resultado)
    }

    @Test
    fun `set alumnos substitue a lista`() {
        val manager = AlumnoManager()
        val novaLista = mutableListOf(
            Alumno("Ana", 20, 8.0),
            Alumno("Luis", 17, 6.0)
        )

        manager.setAlumnos(novaLista)

        assertEquals(2, manager.getAlumnos().size)
        assertEquals("Ana", manager.getAlumnos()[0].nombre)
    }
}