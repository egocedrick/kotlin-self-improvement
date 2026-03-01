package oop.abstraction

// Functional Interface

fun interface Logger {
    fun log(message: String)
}

// Usage with lambda
fun main() {
    val consoleLogger: Logger = Logger { msg -> println("Console: $msg") }
    val fileLoggr : Logger = Logger { msg -> println("File: $msg (pretend saved)")}

    consoleLogger.log("System Started")
    fileLoggr.log("System Error")
}