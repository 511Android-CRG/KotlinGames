package com.example.myapplication.Tareas

/*
El programa solicita al usuario que ingrese un número entero. Luego, determina si el
número ingresado es un número primo o no, e imprime el resultado correspondiente.
*/

fun main() {
    var numero_Prueba: Int?

    // Solicitamos al usuario ingresar un número entero
    print("Ingresa un número entero para verificar si es primo o no: ")
    numero_Prueba = readlnOrNull()?.toIntOrNull()

    // Verificamos que la entrada no sea nula
    if (numero_Prueba == null) {
        println("Entrada no válida. Debes ingresar un número entero.")
        return
    }

    /*
    Condición que verifica si el número ingresado es primo.
    Si es primo, se imprime un mensaje indicándolo.
    Si no es primo o si el número es 1, se indica que no es primo.
    */
    if (esPrimo(numero_Prueba)) {
        println("¡El número $numero_Prueba es PRIMO!")
    } else {
        println("El número $numero_Prueba no es primo.")
    }
}

// Función para verificar si un número es primo
fun esPrimo(verificacion: Int): Boolean {
    if (verificacion <= 1) return false //

    /*
    Recorremos desde 2 hasta la raíz cuadrada del número,
    ya que no es necesario verificar divisores mayores que eso.
    Aqui me apote de chat :))) */

    for (i in 2..Math.sqrt(verificacion.toDouble()).toInt()) {
        if (verificacion % i == 0) return false // Si tiene un divisor, no es primo
    }
    return true
}
