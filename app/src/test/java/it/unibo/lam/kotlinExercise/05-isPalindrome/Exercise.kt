package it.unibo.lam.kotlinExercise.`05-isPalindrome`


import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * ## Instructions
 *
 * Data una sringa ritorna true se e' palindroma altrimenti ritorna false.
 *
 * ## Examples
 *
 * palindrome("abba") // true
 *
 * palindrome("abcdefg") // false
 *
 */
private fun isPalindrome(str: String): Boolean {
    TODO("Add your solution here")
}

internal class Test {

    @Test
    fun `'aba' is a palindrome`() {
        assertEquals(isPalindrome("aba"), true)
    }

    @Test
    fun `' aba' is not a palindrome`() {
        assertEquals(isPalindrome(" aba"), false)
    }

    @Test
    fun `'aba ' is not a palindrome`() {
        assertEquals(isPalindrome("aba "), false)
    }

    @Test
    fun `'greetings' is not a palindrome`() {
        assertEquals(isPalindrome("greetings"), false)
    }

    @Test
    fun `'1000000001' a palindrome`() {
        assertEquals(isPalindrome("1000000001"), true)
    }

    @Test
    fun `'Fish hsif' is not a palindrome`() {
        assertEquals(isPalindrome("Fish hsif"), false)
    }

    @Test
    fun `'pennep' a palindrome`() {
        assertEquals(isPalindrome("pennep"), true)
    }
}
