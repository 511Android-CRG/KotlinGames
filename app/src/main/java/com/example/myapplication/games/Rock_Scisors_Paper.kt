package com.example.myapplication.games

/*
  El programa solicitara al jugador que ingrese un numero a su eleccion
       1. PIEDRA
       2. PAPEL
      3. TIJERA

       El programa mostrará la eleccion de la computadora

   Las reglas
   Piedra vence a tijera
   Tijera vence a papel
   Papel vence a piedra

   Se determina al ganador del juego

   El programa debe manejar invalidps o numeros fuera del ranco especificado

 */

fun main(){
    println("Ingresa un numero del 1 al 3, donde \n 1 es piedra\n 2 es tijera \n 3 es papel \n")
    var choiceInput = readlnOrNull()?.toIntOrNull()

    var isValidInput = choiceInput != null && choiceInput in 1..3

    while (!isValidInput){
        println("Entrada no valida, porfavor ingresa los numeros 1 , 2 , 3")
        choiceInput = readlnOrNull()?.toIntOrNull()
        isValidInput = choiceInput != null && choiceInput in 1..3
    }

    println("Juego se ejecuto")
    val computerChoice = (1..3).random()

    val computerChoiceString = when{
        computerChoice == 1 -> "Piedra"
        computerChoice == 2 -> "Tijera"
        computerChoice == 3 -> "Papel"
        else -> "Sin elección"
    }
    println("La computadora selecciono $computerChoiceString")
    val winner = when{
        choiceInput == computerChoice -> "Empate"
        choiceInput == 1 && computerChoice == 2 -> "El jugador"
        choiceInput == 2 && computerChoice == 3 -> "El jugador"
        choiceInput == 3 && computerChoice == 1 -> "El jugador"
        else -> "La computadora"
    }
    println("El ganador es: $winner")
}