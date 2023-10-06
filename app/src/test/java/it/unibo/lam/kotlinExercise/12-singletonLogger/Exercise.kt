package it.unibo.lam.kotlinExercise.`12-singletonLogger`

import org.junit.Test
import kotlin.test.assertEquals

/*
 * Crea una classe Singleton chiamata Logger che consenta la registrazione di messaggi di log
 * in tutta l'applicazione. La classe deve includere metodi per registrare messaggi di log a
 * diversi livelli di severità (es. info, avviso, errore) e per recuperare i log registrati.
 *
 **/
class LoggerTest {
    @Test
    fun testLogInfo() {
        Logger.logInfo("Messaggio di informazione")
        assertEquals("[INFO] Messaggio di informazione", Logger.getLogs().last())
    }

    @Test
    fun testLogWarning() {
        Logger.logWarning("Messaggio di avviso")
        assertEquals("[AVVISO] Messaggio di avviso", Logger.getLogs().last())
    }

    @Test
    fun testLogError() {
        Logger.logError("Messaggio di errore")
        assertEquals("[ERRORE] Messaggio di errore", Logger.getLogs().last())
    }
}
