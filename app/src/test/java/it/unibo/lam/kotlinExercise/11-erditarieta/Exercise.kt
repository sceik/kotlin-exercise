package it.unibo.lam.kotlinExercise.`11-erditarieta`

import org.junit.Test
import kotlin.test.assertEquals


/**
 * ## Instructions
 *
 * Crea una gerarchia di classi per rappresentare animali. Crea una classe base Animale e deriva da essa
 * classi derivate come Cane, Gatto e Uccello. Ogni classe deve avere proprietà e metodi specifici dell'animale.
 *
 *
 */
class AnimalTest {
    @Test
    fun testDogSound() {
        val cane = Cane("Fido")
        assertEquals("Woof!", cane.emettereSuono())
    }

    @Test
    fun testCatSound() {
        val gatto = Gatto("Whiskers")
        assertEquals("Meow!", gatto.emettereSuono())
    }

    @Test
    fun testBirdSound() {
        val uccello = Uccello("Tweety")
        assertEquals("Tweet!", uccello.emettereSuono())
    }
}
