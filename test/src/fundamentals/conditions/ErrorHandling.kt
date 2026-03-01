package fundamentals.conditions

fun main() {
    try {
        val result = 10 / 2
        println("Total: $result")
    } catch (e: ArithmeticException) {
        println("Error: Division by zero")
    } finally {
        println("Operation finished")
    }
}