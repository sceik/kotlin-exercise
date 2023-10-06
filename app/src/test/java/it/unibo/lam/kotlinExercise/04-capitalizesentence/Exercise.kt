package it.unibo.lam.kotlinExercise.`04-capitalizesentence`

import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * ## Instructions
 *
 * Trasforma in Maiuscolo la prima lettera di tutte le parole presenti in una data stringa
 *
 */
private fun capitalizeSentence(str: String): String {
    TODO("Add your solution here")
}

internal class Test {
    @Test
    fun `"flower" is capitalized to "Flower"`() {
        assertEquals(capitalizeSentence("flower"), "Flower")
    }

    @Test
    fun `"this is a house" is capitalised to "This Is A House"`() {
        assertEquals(capitalizeSentence("this is a house"), "This Is A House")
    }
}
