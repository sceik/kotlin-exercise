package it.unibo.lam.kotlinExercise.`06-calculator`


import org.junit.Test
import kotlin.test.assertEquals

/**
 * ## Instructions
 *
 * Implementa una calcolatrice che esegue le seguenti operazioni (operator):
 * - add
 * - subtract
 * - multiply
 * - divide
 *
 *
 */
fun calculate(a: Double, b: Double, operator: String): Double {
    TODO("Add your solution here")
}

class CalculatorTest {
    @Test
    fun testAddition() {
        assertEquals(10.0, calculate(5.0, 5.0, "add"))
    }

    @Test
    fun testSubtraction() {
        assertEquals(5.0, calculate(10.0, 5.0, "subtract"))
    }

    @Test
    fun testMultiplication() {
        assertEquals(25.0, calculate(5.0, 5.0, "multiply"))
    }

    @Test
    fun testDivision() {
        assertEquals(2.0, calculate(10.0, 5.0, "divide"))
    }
}
