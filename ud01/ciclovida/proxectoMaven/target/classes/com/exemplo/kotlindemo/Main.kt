package com.exemplo.kotlindemo

import com.exemplo.kotlindemo.*

fun main() {
    val calc = Calculadora()
    val vista = VistaCalculadora()

    vista.mostrarMensaxe("=== Calculadora en Kotlin ===")
    vista.mostrarMensaxe("Escribe 'saír' para rematar o programa.\n")

    while (true) {
        val entradaA = vista.pedirEntrada("Introduce o primeiro número (ou 'exit'): ")
        if (entradaA == null || entradaA == "exit") break
        val a = entradaA.toDoubleOrNull()
        if (a == null) {
            vista.mostrarErro("Entrada non válida.")
            continue
        }

        val b = vista.pedirNumero("Introduce o segundo número: ")
        if (b == null) {
            vista.mostrarErro("Entrada non válida.")
            continue
        }

        val op = vista.pedirEntrada("Escolle unha operación (+, -, *, /): ")

        val resultado = when (op) {
            "+" -> calc.sumar(a, b)
            "-" -> calc.restar(a, b)
            "*" -> calc.multiplicar(a, b)
            "/" -> try {
                calc.dividir(a, b)
            } catch (e: IllegalArgumentException) {
                vista.mostrarErro(e.message ?: "Erro descoñecido.")
                null
            }
            else -> {
                vista.mostrarErro("Operación non válida.")
                null
            }
        }

        if (resultado != null) {
            vista.mostrarResultado(resultado)
        }
    }

    vista.mostrarMensaxe("Programa rematado. Grazas por usar a calculadora.")
}