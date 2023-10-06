package it.unibo.lam.kotlinExercise.`08-listSearch`

import kotlin.test.assertEquals
import kotlin.test.Test

/**
 * ## Instructions
 *
 * Data una lista di elementi ordinati ed un element ritorna l'indice di quest'ultimo.
 * Se l'elmento non e' presente ritorna -1
 *
 * ## Examples
 *
 * search(listOf('A', 'B', 'C'), 'A') // 0
 *
 * search(listOf('A', 'B', 'C'), 'B') // 1
 *
 * search(listOf('A', 'B', 'C'), 'H') // -1
 *
 */
private fun search(list: List<Char>, element: Char): Int {
    TODO("Add your solution here")
}

internal class Test {
    @Test
    fun `index of A in A, B, C is 0`() {
        assertEquals(search(listOf('A', 'B', 'C'), 'A'), 0)
    }

    @Test
    fun `index of B in A, B, C is 1`() {
        assertEquals(search(listOf('A', 'B', 'C'), 'B'), 1)
    }

    @Test
    fun `index of C in A, B, C is 2`() {
        assertEquals(search(listOf('A', 'B', 'C'), 'C'), 2)
    }

    @Test
    fun `index of H in A, B, C is -1`() {
        assertEquals(search(listOf('A', 'B', 'C'), 'H'), -1)
    }

    @Test
    fun `index of A in A, B, C, D is 0`() {
        assertEquals(search(listOf('A', 'B', 'C', 'D'), 'A'), 0)
    }

    @Test
    fun `index of B in A, B, C, D is 1`() {
        assertEquals(search(listOf('A', 'B', 'C', 'D'), 'B'), 1)
    }

    @Test
    fun `index of C in A, B, C, D is 2`() {
        assertEquals(search(listOf('A', 'B', 'C', 'D'), 'C'), 2)
    }

    @Test
    fun `index of D in A, B, C, D is 2`() {
        assertEquals(search(listOf('A', 'B', 'C', 'D'), 'D'), 3)
    }

    @Test
    fun `index of H in A, B, C, D is -1`() {
        assertEquals(search(listOf('A', 'B', 'C', 'D'), 'H'), -1)
    }
}
