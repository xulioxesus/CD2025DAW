package com.example

class AlumnoManager {

    private var alumnos: MutableList<Alumno> = mutableListOf()

    fun agregarAlumno(a: Alumno?) {
        if (a != null) {
            alumnos.add(a)
        }
    }

    fun buscarAlumnoPorNombre(nombre: String): Alumno? {
        for (a in alumnos) {
            if (a.nombre == nombre) {
                return a
            }
        }
        return null
    }

    fun calcularMedia(): Double {
        var suma = 0.0

        for (a in alumnos) {
            suma += a.notaMedia
        }

        if (alumnos.isEmpty()) {
            return 0.0
        }

        return suma / alumnos.size
    }

    fun clasificarAlumno(a: Alumno?): String {
        if (a == null) {
            return "Alumno nulo"
        }

        return if (a.notaMedia >= 9 && a.edad >= 18) {
            "Sobresaliente adulto"
        } else if (a.notaMedia >= 9 && a.edad < 18) {
            "Sobresaliente menor"
        } else if (a.notaMedia >= 7 && a.edad >= 18) {
            "Notable adulto"
        } else if (a.notaMedia >= 7 && a.edad < 18) {
            "Notable menor"
        } else if (a.notaMedia >= 5 && a.edad >= 18) {
            "Aprobado adulto"
        } else if (a.notaMedia >= 5 && a.edad < 18) {
            "Aprobado menor"
        } else if (a.edad >= 18) {
            "Suspenso adulto"
        } else {
            "Suspenso menor"
        }
    }

    fun mostrarAlumnosAprobados() {
        for (a in alumnos) {
            if (a.notaMedia >= 5) {
                println("Alumno aprobado: ${a.nombre}")
            }
        }
    }

    fun mostrarAlumnosSuspensos() {
        for (a in alumnos) {
            if (a.notaMedia < 5) {
                println("Alumno suspenso: ${a.nombre}")
            }
        }
    }

    fun getAlumnos(): MutableList<Alumno> {
        return alumnos
    }

    fun setAlumnos(alumnos: MutableList<Alumno>) {
        this.alumnos = alumnos
    }
}