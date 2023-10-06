package it.unibo.lam.kotlinExercise.`01-printnumber`

import kotlin.test.assertEquals
import kotlin.test.Test

/**
 * Dato un numero positivo 'n' implementa una funzione che ritorni una lista con tutti i numeri da 'n' a 1.
 * Se n e' uguale a 0 allora tornare una lista vuota
 *
 * # Examples
 *
 * printNumber(0) // []
 *
 * printNumber(2) // [2, 1]
 *
 * printNumber(5) // [5, 4, 3, 2, 1]
 *
 */
private fun printNumber(n: Int): List<Int> {
    TODO("Add your solution here")
}

internal class Test {
    @Test
    fun `printNumber 0 return listOf()`() {
        assertEquals(printNumber(0), listOf())
    }

    @Test
    fun `printNumber 1 return listOf(1)`() {
        assertEquals(printNumber(1), listOf(1))
    }

    @Test
    fun `printNumber 3 return listOf(3, 2, 1)`() {
        assertEquals(printNumber(3), listOf(3, 2, 1))
    }

    @Test
    fun `printNumber 5 return listOf(5, 4, 3, 2, 1)`() {
        assertEquals(printNumber(5), listOf(5, 4, 3, 2, 1))
    }
}
