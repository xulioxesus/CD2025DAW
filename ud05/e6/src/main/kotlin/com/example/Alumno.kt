package com.example

class Alumno() {

    var nombre: String = ""
    var edad: Int = 0
    var notaMedia: Double = 0.0

    constructor(nombre: String, edad: Int, notaMedia: Double) : this() {
        this.nombre = nombre
        this.edad = edad
        this.notaMedia = notaMedia
    }
}