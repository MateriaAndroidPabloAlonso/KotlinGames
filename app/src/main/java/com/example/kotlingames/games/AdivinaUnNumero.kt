package com.example.kotlingames.games

// Adivina un numero
// Se debe seleccionar un numero dentro de un rango
// La computadora debe ser capaz de seleccionar ese numero
// El programa debe solicitar al usuario ingresar la suposicion
// Debe de asegurarse recibir numeros validos
// El juego termina cuando el jugador acierte el numero

fun main() {
    val range = 1..10
    val numberToGuess = range.random()
    var attempts = 0
    println("Bienvenido al juego de Adivina un Numero")
    println("Estoy pensando en un numero entre 1 y 10. Adivinalo")
    println("Ingresa tu suposicion.")


    do {
        var guess = readlnOrNull()?.toIntOrNull()
        if(guess != null) {
            // El numero que me pasaron es valido
            attempts++

            when {
                guess < numberToGuess -> println("El numero que estoy pensando es mayor")
                guess > numberToGuess -> println("El numero que estoy pensando es menor")
                else -> println("Felicidades le atinaste, lo adivinaste en $attempts intentos")
            }


        }
        else {
            // No es un numero
            println("Por favor, ingresa un numero valido")
        }
    } while (guess != numberToGuess)
}