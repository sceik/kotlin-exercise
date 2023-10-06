package it.unibo.lam.kotlinExercise.`09-listSort`

import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * ## Instructions
 *
 * Sort list of numbers from lowest number to greatest number using
 *
 * Algorithm:
 * - Pick first element as pivot (pivot can be also last, random element but we explicitly always pick first element)
 * - Partition elements - start traversing from the leftmost element and if a smaller element is found, swap current
 *   element with `list[i]`. Keep track of index of smaller to elements at index (`pivotIndex`).
 * - Swap pivot with element at `pivotIndex`
 * - Recursively repeat the process for left partition (element on the left side of pivot) and right partition (element on
 *   the right side of the pivot)
 *
 */
private fun quickSort(list: MutableList<Int>, left: Int = 0, right: Int = list.lastIndex): List<Number> {
    TODO("Add your solution here")
}

private fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

internal class Test {
    @Test
    fun `quick sort empty list`() {
        assertEquals(quickSort(mutableListOf()), listOf())
    }

    @Test
    fun `quick sort 7`() {
        assertEquals(quickSort(mutableListOf(7)), listOf(7))
    }

    @Test
    fun `quick sort empty list 9, 3`() {
        assertEquals(quickSort(mutableListOf(9, 3)), listOf(3, 9))
    }

    @Test
    fun `quick sort 5, 1, 4, 2`() {
        assertEquals(quickSort(mutableListOf(5, 1, 4, 2)), listOf(1, 2, 4, 5))
    }

    @Test
    fun `quick sort 5, 2, 1, 8, 4, 7, 6, 3`() {
        assertEquals(
            quickSort(mutableListOf(5, 2, 1, 8, 4, 7, 6, 3)), listOf(
                1,
                2,
                3,
                4,
                5,
                6,
                7,
                8,
            )
        )
    }

    @Test
    fun `quick sort 17, 4, 12, 19, 80, 75, 16`() {
        assertEquals(
            quickSort(mutableListOf(17, 4, 12, 19, 80, 75, 16)), listOf(
                4,
                12,
                16,
                17,
                19,
                75,
                80,
            )
        )
    }

    @Test
    fun `quick sort 11, 40, 40, 50, 43, 10, 30, 42, 20, 6, 19, 32, 20, 41, 23, 27`() {
        val list = mutableListOf(11, 40, 40, 50, 43, 10, 30, 42, 20, 6, 19, 32, 20, 41, 23, 27)
        val sorted = mutableListOf(6, 10, 11, 19, 20, 20, 23, 27, 30, 32, 40, 40, 41, 42, 43, 50)

        assertEquals(quickSort(list), sorted)
    }
}
