package it.unibo.lam.kotlinExercise.`12-singletonLogger`



object Logger {
    private val logs = mutableListOf<String>()

    fun logInfo(message: String) {
        logs.add("[INFO] $message")
    }

    fun logWarning(message: String) {
        logs.add("[AVVISO] $message")
    }

    fun logError(message: String) {
        logs.add("[ERRORE] $message")
    }

    fun getLogs(): List<String> {
        return logs.toList()
    }
}
