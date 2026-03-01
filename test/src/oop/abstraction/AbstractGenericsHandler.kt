package oop.abstraction

// Abstract class with generic type
abstract class DataHandler<T> {
    abstract fun process(data: T): String
}

// Concrete implementation
class IntHandler : DataHandler<Int>() {
    override fun process(data: Int): String = "Processed Int: ${data * 2}"
}

class StringHandler : DataHandler<String>() {
    override fun process(data: String): String = "Processed String: ${data.uppercase()}"
}

// Usage
fun main() {
    val intHandler = IntHandler()
    val stringHandler = StringHandler()

    println(intHandler.process(10))
    println(stringHandler.process("hello"))
}

