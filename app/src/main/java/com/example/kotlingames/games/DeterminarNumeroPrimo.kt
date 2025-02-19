package com.example.kotlingames.games

fun main() {
    /*
    El programa solicita al usuario que ingrese un número entero.
    Luego, determina si el número ingresado es un número primo o no,
    e imprime el resultado correspondiente
    Los numeros primos son aquellos numeros enteros mayores que 1
    y que solo son divisibles por si mismos y por 1
     */

    println("Ingresa un numero que sea mayor o igual a 2")
    println("No se puede ingresar 1 ya que no es considerado un numero primo")
    var numberInput = readlnOrNull()?.toIntOrNull()
    var esValidoInput = numberInput != null && numberInput >= 2
    while (!esValidoInput) {
        println("Ingresa un numero valido")
        numberInput = readlnOrNull()?.toIntOrNull()
        if (numberInput == 1) {
            println("Debes de ingresar un numero mayor a 1")
        }
    }

    var contador = 0
    for (i in 1..numberInput!!) {
        if (numberInput % i == 0) {
            contador++
        }
        if (contador > 2) {
            break
        }
    }

    var mensajeNumeroPrimo = when {
        contador == 2 -> "El numero $numberInput es primo"
        else -> "El numero $numberInput no es primo"
    }

    println(mensajeNumeroPrimo)
}