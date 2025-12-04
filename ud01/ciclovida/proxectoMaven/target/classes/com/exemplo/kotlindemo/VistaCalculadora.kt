package com.exemplo.kotlindemo

class VistaCalculadora {

    fun mostrarMensaxe(texto: String) {
        println(texto)
    }

    fun pedirEntrada(mensaxe: String): String? {
        print(mensaxe)
        return readLine()
    }

    fun pedirNumero(mensaxe: String): Double? {
        val entrada = pedirEntrada(mensaxe)
        return entrada?.toDoubleOrNull()
    }

    fun mostrarResultado(resultado: Double) {
        println("Resultado: $resultado\n")
    }

    fun mostrarErro(mensaxe: String) {
        println("Erro: $mensaxe\n")
    }
}