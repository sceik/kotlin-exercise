package it.unibo.lam.kotlinExercise.`03-power`

import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * ## Instructions
 *
 * Dati due numeri interi positivi base (base) ed esponente (exponent) calcola la potenza
 *
 * ## Examples
 *
 * power(2, 1) // 1
 *
 * power(2, 2) // 4
 *
 * power(3, 3) // 27
 */
private fun power(base: Int, exponent: Int): Int {
    TODO("Add your solution here")
}

internal class Test {
    @Test
    fun `power 2^1 returns 2`() {
        assertEquals(power(2, 1), 2)
    }

    @Test
    fun `power 2^2 returns 2`() {
        assertEquals(power(2, 2), 4)
    }

    @Test
    fun `power 2^3 returns 8`() {
        assertEquals(power(2, 3), 8)
    }

    @Test
    fun `power 3^4 returns 81`() {
        assertEquals(power(3, 4), 81)
    }
}
