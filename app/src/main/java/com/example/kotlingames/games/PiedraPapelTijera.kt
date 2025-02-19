package com.example.kotlingames.games

/*
El programa solicitara al jugador que ingrese un numero a su eleccion
    1. Para Piedra
    2. Para Tijera
    4. Para Papel

    El programa mostrara la eleccion de la computadora

    Las reglas
    Piedra vence a Tijere
    Tijera vence a Papel
    Papel vence a Piedra

    Se debe determinar al ganador del juego

    El programa debe manejar entradas invalidas o numeros fuera del rango especificado
 */

fun main() {
    println("Por favor ingresa un numero del 1 al 3, donde \n1. Piedra\n2. Tijera\n3. Papel\n")
    var choiseInput = readlnOrNull()?.toIntOrNull()
    var isValidInput = choiseInput != null && choiseInput in 1..3

    while (!isValidInput) {
        println("Entrada no valida. Por favor ingresa los numeros 1, 2, 3")
        choiseInput = readlnOrNull()?.toIntOrNull()
    }
    println("Juego se ejecuto")
    val computerChoice = (1..3).random()
    val computerChoiceString = when {
        computerChoice == 1 -> "Piedra"
        computerChoice == 2 -> "Tijera"
        computerChoice == 3 -> "Papel"
        else -> "Sin eleccion"
    }

    println("La computadora seleccion $computerChoiceString")
    val winner = when{
        choiseInput == computerChoice -> "Empate"
        choiseInput == 1 && computerChoice == 2 -> "El Jugador"
        choiseInput == 2 && computerChoice == 3 -> "El Jugador"
        choiseInput == 3 && computerChoice == 1 -> "El Jugador"
        else -> "La computadora"
    }
    println("El ganador es: $winner")
}
