package it.unibo.lam.kotlinExercise.`10-ordini`

import org.junit.Test
import kotlin.test.assertEquals



/**
 * ## Instructions
 *
 * Crea una classe Ordine che rappresenta un ordine di prodotti. La classe deve contenere dettagli sull'ordine,
 * quali prodotti, quantità e prezzo totale.
 *
 * Crea una classe GestioneOrdini che consente di aggiungere, rimuovere e calcolare il totale degli ordini.
 *
 * class Ordine(val id: Int, val prodotto: String, val quantita: Int, val prezzoUnitario: Double)
 *
 */

class OrderManagementTest {
    @Test
    fun testAddOrder() {
        val gestioneOrdini = GestioneOrdini()
        val ordine = Ordine(1, "Prodotto1", 2, 10.0)
        gestioneOrdini.aggiungiOrdine(ordine)
        gestioneOrdini.aggiungiOrdine(ordine)
        assertEquals(40.0, gestioneOrdini.calcolaTotaleOrdini())
    }

    @Test
    fun testRemoveOrder() {
        val gestioneOrdini = GestioneOrdini()
        val ordine = Ordine(1, "Prodotto1", 2, 10.0)
        gestioneOrdini.aggiungiOrdine(ordine)
        gestioneOrdini.rimuoviOrdine(1)
        assertEquals(0.0, gestioneOrdini.calcolaTotaleOrdini())
    }
}