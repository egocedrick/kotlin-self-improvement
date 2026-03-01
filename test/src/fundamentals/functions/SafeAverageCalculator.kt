fun safeAverage(a: Int, b: Int): Int? {
    return if (a >= 0 && b >= 0) {
        (a + b) / 2
    } else {
        null
    }
}

fun main() {
    val result1 = safeAverage(10, 20)
    println("Safe average: ${result1 ?: "Invalid input"}")

    val result2 = safeAverage(-5, 15)
    println("Safe average: ${result2 ?: "Invalid input"}")
}