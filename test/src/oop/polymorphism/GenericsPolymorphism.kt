package oop.polymorphism

class Printer<T> {
    fun printItem(item: T) {
        println("Printing item: $item")
    }
}

fun main() {
    val intPrinter = Printer<Int>()
    intPrinter.printItem(123) // Works with Int

    val stringPrinter = Printer<String>()
    stringPrinter.printItem("Hello Kotlin")  // Works with String

    val doublePrinter = Printer<Double>()
    doublePrinter.printItem(3.14)  // Works with Double
}