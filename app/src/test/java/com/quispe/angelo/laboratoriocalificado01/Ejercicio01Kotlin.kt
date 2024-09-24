package com.quispe.angelo.laboratoriocalificado01

import org.junit.Test

class Ejercicio01Kotlin {

    // Función que verifica si dos palabras son anagramas
    fun sonAnagramas(palabra1: String, palabra2: String): Boolean {
        // Convertimos ambas palabras a minúsculas para evitar problemas de sensibilidad a mayúsculas/minúsculas
        val palabra1Normalizada = palabra1.toLowerCase()
        val palabra2Normalizada = palabra2.toLowerCase()

        // Comparamos la longitud de ambas palabras, si no son iguales no pueden ser anagramas
        if (palabra1Normalizada.length != palabra2Normalizada.length) {
            return false
        }

        // Convertimos ambas palabras en arreglos de caracteres, luego los ordenamos
        val arreglo1 = palabra1Normalizada.toCharArray().sortedArray()
        val arreglo2 = palabra2Normalizada.toCharArray().sortedArray()

        // Comparamos ambos arreglos ordenados, si son iguales, entonces las palabras son anagramas
        return arreglo1.contentEquals(arreglo2)
    }



    @Test
    fun testSonAnagramas() {
        // Probamos con "listen" y "silent", que son anagramas
        val resultado1 = sonAnagramas("listen", "silent")
        if (resultado1) {
            println("Test 1 pasado: 'listen' y 'silent' son anagramas")
        } else {
            println("Test 1 fallido: 'listen' y 'silent' no son anagramas")
        }

        // Probamos con "hello" y "world", que no son anagramas
        val resultado2 = sonAnagramas("hello", "world")
        if (!resultado2) {
            println("Test 2 pasado: 'hello' y 'world' no son anagramas")
        } else {
            println("Test 2 fallido: 'hello' y 'world' son anagramas")
        }

        // Probamos con "elbow" y "below", que son anagramas
        val resultado3 = sonAnagramas("elbow", "below")
        if (resultado3) {
            println("Test 3 pasado: 'elbow' y 'below' son anagramas")
        } else {
            println("Test 3 fallido: 'elbow' y 'below' no son anagramas")
        }

        // Probamos con "rat" y "car", que no son anagramas
        val resultado4 = sonAnagramas("rat", "car")
        if (!resultado4) {
            println("Test 4 pasado: 'rat' y 'car' no son anagramas")
        } else {
            println("Test 4 fallido: 'rat' y 'car' son anagramas")
        }
    }
}
