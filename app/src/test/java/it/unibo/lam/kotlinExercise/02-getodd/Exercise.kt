package it.unibo.lam.kotlinExercise.`02-getodd`

import kotlin.test.Test
import kotlin.test.assertEquals


/**
 *
 * ## Instructions
 *
 * Data una lista di numeri interi ritorna una lista contenente solo quelli negativi
 *
 * ## Examples
 *
 * getOdd(listOf(1, 2, 3)) // 1, 3
 *
 * getOdd(listOf(4, 6, 8, 7, 9)) // 7, 9
 *
 */
private fun filterOdd(list: List<Int>): List<Int> {
    TODO("Add your solution here")
}

internal class Test {
    @Test
    fun `empty list returns empty list`() {
        assertEquals(filterOdd(listOf()), emptyList())
    }

    @Test
    fun `1, 2, 3 returns 1, 3`() {
        assertEquals(filterOdd(listOf(1, 2, 3)), listOf(1, 3))
    }

    @Test
    fun `2, 9, 2, 5, 4 returns 9, 5`() {
        assertEquals(filterOdd(listOf(2, 9, 2, 5, 4)), listOf(9, 5))
    }

    @Test
    fun `7, 4, 6, 8, 7, 9 returns 7, 7, 9`() {
        assertEquals(filterOdd(listOf(7, 4, 6, 8, 7, 9)), listOf(7, 7, 9))
    }
}
