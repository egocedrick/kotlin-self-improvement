fun averageWithPrint(a: Int, b: Int) {
    val avg = (a + b) / 2
    println("Average (printed only): $avg")
}

fun averageWithReturn(a: Int, b: Int): Int {
    val avg = (a + b) / 2
    return avg
}

fun main() {
    // Using println version
    averageWithPrint(10, 20)   // console shows "Average (printed only): 15"

    // Using return version
    val result = averageWithReturn(10, 20)
    println("Average (returned value): $result")

    // Proof you can reuse the returned value
    val doubled = result * 2
    println("Doubled average: $doubled")
}